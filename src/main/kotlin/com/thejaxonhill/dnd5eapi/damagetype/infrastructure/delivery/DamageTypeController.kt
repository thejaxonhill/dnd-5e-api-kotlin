package com.thejaxonhill.dnd5eapi.damagetype.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.damagetype.application.dto.DamageTypeView
import com.thejaxonhill.dnd5eapi.damagetype.application.usecase.LoadDamageTypeByIndex
import com.thejaxonhill.dnd5eapi.damagetype.application.usecase.LoadDamageTypes
import com.thejaxonhill.dnd5eapi.damagetype.domain.model.DamageTypeExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Damage Types")
@RestController
@RequestMapping("/api/damage-types")
class DamageTypeController(
    private val loadDamageTypeByIndex: LoadDamageTypeByIndex,
    private val loadDamageTypes: LoadDamageTypes
) {
    @Operation(summary = "Get a paginated list of damage types")
    @GetMapping
    fun getDamageTypes(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: DamageTypeExample?
    ): ResponseEntity<PagedModel<DamageTypeView>> =
        ResponseEntity.ok(loadDamageTypes.load(pageable.toPage(), example))

    @Operation(summary = "Get a damage type by index")
    @GetMapping("/{index}")
    fun getDamageType(@PathVariable index: String): ResponseEntity<DamageTypeView> =
        ResponseEntity.ok(loadDamageTypeByIndex.load(index))
}