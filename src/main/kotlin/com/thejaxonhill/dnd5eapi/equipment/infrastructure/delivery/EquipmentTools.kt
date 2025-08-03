package com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadAllEquipment
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadEquipment
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class EquipmentTools(
    private val loadEquipment: LoadEquipment,
    private val loadAllEquipment: LoadAllEquipment
) {
    @Tool
    fun getAllEquipment() = loadAllEquipment.load()

    @Tool
    fun getEquipment(index: String) = loadEquipment.load(index)
}