package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import com.thejaxonhill.dnd5eapi.weaponproperty.application.dto.WeaponPropertyView
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponProperties
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponPropertyByIndex
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponPropertyExample
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Weapon Properties")
@RestController
@RequestMapping("/api/weapon-properties")
class WeaponPropertyController(
    private val loadWeaponPropertyByIndex: LoadWeaponPropertyByIndex,
    private val loadWeaponProperties: LoadWeaponProperties
) {
    @Operation(summary = "Get a paginated list of weapon properties")
    @GetMapping
    fun getWeaponProperties(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: WeaponPropertyExample?
    ): ResponseEntity<PagedModel<WeaponPropertyView>> =
        ResponseEntity.ok(loadWeaponProperties.load(pageable.toPage(), example))

    @Operation(summary = "Get a weapon property by index")
    @GetMapping("/{index}")
    fun getWeaponProperty(@PathVariable index: String): ResponseEntity<WeaponPropertyView> =
        ResponseEntity.ok(loadWeaponPropertyByIndex.load(index))
}