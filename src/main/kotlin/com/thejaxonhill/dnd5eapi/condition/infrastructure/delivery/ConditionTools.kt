package com.thejaxonhill.dnd5eapi.condition.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.condition.application.usecase.LoadConditionByIndex
import com.thejaxonhill.dnd5eapi.condition.application.usecase.LoadConditions
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class ConditionTools(
    private val loadConditionByIndex: LoadConditionByIndex,
    private val loadConditions: LoadConditions
) {
    @Tool
    fun getConditions(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadConditions.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getCondition(index: String) = loadConditionByIndex.load(index)
}