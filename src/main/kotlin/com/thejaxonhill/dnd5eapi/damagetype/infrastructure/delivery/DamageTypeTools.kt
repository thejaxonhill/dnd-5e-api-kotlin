package com.thejaxonhill.dnd5eapi.damagetype.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.damagetype.application.usecase.LoadDamageType
import com.thejaxonhill.dnd5eapi.damagetype.application.usecase.LoadDamageTypes
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class DamageTypeTools(
    private val loadDamageType: LoadDamageType,
    private val loadDamageTypes: LoadDamageTypes
) {
    @Tool
    fun getDamageTypes() = loadDamageTypes.load()

    @Tool
    fun getDamageType(index: String) = loadDamageType.load(index)
}