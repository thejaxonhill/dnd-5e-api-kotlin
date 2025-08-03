package com.thejaxonhill.dnd5eapi.condition.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.condition.application.usecase.LoadCondition
import com.thejaxonhill.dnd5eapi.condition.application.usecase.LoadConditions
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class ConditionTools(
    private val loadCondition: LoadCondition,
    private val loadConditions: LoadConditions
) {
    @Tool
    fun getConditions() = loadConditions.load()

    @Tool
    fun getCondition(index: String) = loadCondition.load(index)
}