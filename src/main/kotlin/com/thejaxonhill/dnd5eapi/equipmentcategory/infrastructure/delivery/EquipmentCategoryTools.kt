package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategories
import com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase.LoadEquipmentCategoryByIndex
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class EquipmentCategoryTools(
    private val loadEquipmentCategoryByIndex: LoadEquipmentCategoryByIndex,
    private val loadEquipmentCategories: LoadEquipmentCategories
) {
    @Tool
    fun getEquipmentCategories(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadEquipmentCategories.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getEquipmentCategory(index: String) = loadEquipmentCategoryByIndex.load(index)
}