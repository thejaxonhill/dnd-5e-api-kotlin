package com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipment.application.dto.EquipmentView
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadAllEquipment
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadEquipmentByIndex
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.SearchEquipment
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Equipment")
@RestController
@RequestMapping("/api/equipment")
class EquipmentController(
    private val loadEquipmentByIndex: LoadEquipmentByIndex,
    private val loadAllEquipment: LoadAllEquipment,
    private val searchEquipment: SearchEquipment
) {
    @Operation(summary = "Get a paginated list of equipment")
    @GetMapping
    fun getAllEquipment(
        @PageableDefault(page = 0, size = 10, sort = ["name"], direction = Sort.Direction.ASC)
        @ParameterObject pageable: Pageable,
        @RequestParam(required = false) query: String? = null,
        @ParameterObject example: EquipmentExample?
    ): ResponseEntity<PagedModel<EquipmentView>> =
        ResponseEntity.ok(loadAllEquipment.load(pageable.toPage(), example))

    @Operation(summary = "Get a paginated list of equipment")
    @GetMapping("/search")
    fun searchEquipment(
        @PageableDefault(page = 0, size = 10, sort = ["name"], direction = Sort.Direction.ASC)
        @ParameterObject pageable: Pageable,
        @RequestParam(required = false) query: String? = null,
    ): ResponseEntity<PagedModel<EquipmentView>> =
        ResponseEntity.ok(searchEquipment.search(pageable.toPage(), query))

    @Operation(summary = "Get equipment by index")
    @GetMapping("/{index}")
    fun getEquipment(@PathVariable index: String): ResponseEntity<EquipmentView> =
        ResponseEntity.ok(loadEquipmentByIndex.load(index))
}