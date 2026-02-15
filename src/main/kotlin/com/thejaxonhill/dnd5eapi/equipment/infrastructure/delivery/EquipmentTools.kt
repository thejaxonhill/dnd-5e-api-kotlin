package com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadAllEquipment
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadEquipmentByIndex
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class EquipmentTools(
    private val loadEquipmentByIndex: LoadEquipmentByIndex,
    private val loadAllEquipment: LoadAllEquipment
) {
    @Tool
    fun getAllEquipment(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadAllEquipment.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getEquipment(index: String) = loadEquipmentByIndex.load(index)
}