package com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipment.application.dto.EquipmentView
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadAllEquipment
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadEquipmentByIndex
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentExample
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

@Tag(name = "Equipment")
@RestController
@RequestMapping("/api/equipment")
class EquipmentController(
    private val loadEquipmentByIndex: LoadEquipmentByIndex,
    private val loadAllEquipment: LoadAllEquipment
) {
    @Operation(summary = "Get a paginated list of equipment")
    @GetMapping
    fun getAllEquipment(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: EquipmentExample?
    ): ResponseEntity<PagedModel<EquipmentView>> =
        ResponseEntity.ok(loadAllEquipment.load(pageable.toPage(), example))

    @Operation(summary = "Get equipment by index")
    @GetMapping("/{index}")
    fun getEquipment(@PathVariable index: String): ResponseEntity<EquipmentView> =
        ResponseEntity.ok(loadEquipmentByIndex.load(index))
}