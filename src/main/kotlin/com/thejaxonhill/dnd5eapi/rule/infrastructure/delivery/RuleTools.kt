package com.thejaxonhill.dnd5eapi.rule.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.rule.application.usecase.LoadRuleByIndex
import com.thejaxonhill.dnd5eapi.rule.application.usecase.LoadRules
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RuleTools(
    private val loadRuleByIndex: LoadRuleByIndex,
    private val loadRules: LoadRules
) {
    @Tool
    fun getRules(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadRules.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getRule(index: String) = loadRuleByIndex.load(index)
}