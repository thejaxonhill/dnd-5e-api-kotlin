package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategories
import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategory
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class EquipmentCategoryTools(
    private val loadEquipmentCategory: LoadEquipmentCategory,
    private val loadEquipmentCategories: LoadEquipmentCategories
) {
    @Tool
    fun getEquipmentCategories() = loadEquipmentCategories.load()

    @Tool
    fun getEquipmentCategory(index: String) = loadEquipmentCategory.load(index)
}