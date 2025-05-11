package com.thejaxonhill.dnd5eapi.equipmentcategory.delivery

import com.thejaxonhill.dnd5eapi.equipmentcategory.usecase.LoadEquipmentCategories
import com.thejaxonhill.dnd5eapi.equipmentcategory.usecase.LoadEquipmentCategory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/equipment-categories")
class EquipmentCategoryController(
    private val loadEquipmentCategory: LoadEquipmentCategory,
    private val loadEquipmentCategories: LoadEquipmentCategories
) {
    @GetMapping
    fun getEquipmentCategories() = ResponseEntity.ok(loadEquipmentCategories.load())

    @GetMapping("/{index}")
    fun getEquipmentCategory(@PathVariable index: String) = ResponseEntity.ok(loadEquipmentCategory.load(index))
}