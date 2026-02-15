package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipmentcategory.application.dto.EquipmentCategoryView
import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategories
import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategoryByIndex
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategoryExample
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

@Tag(name = "Equipment Categories")
@RestController
@RequestMapping("/api/equipment-categories")
class EquipmentCategoryController(
    private val loadEquipmentCategoryByIndex: LoadEquipmentCategoryByIndex,
    private val loadEquipmentCategories: LoadEquipmentCategories
) {
    @Operation(summary = "Get a paginated list of equipment categories")
    @GetMapping
    fun getEquipmentCategories(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: EquipmentCategoryExample?
    ): ResponseEntity<PagedModel<EquipmentCategoryView>> =
        ResponseEntity.ok(loadEquipmentCategories.load(pageable.toPage(), example))

    @Operation(summary = "Get an equipment category by index")
    @GetMapping("/{index}")
    fun getEquipmentCategory(@PathVariable index: String): ResponseEntity<EquipmentCategoryView> =
        ResponseEntity.ok(loadEquipmentCategoryByIndex.load(index))
}