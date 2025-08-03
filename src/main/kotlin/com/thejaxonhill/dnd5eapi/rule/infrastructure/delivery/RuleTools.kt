package com.thejaxonhill.dnd5eapi.rule.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.rule.application.usecase.LoadRule
import com.thejaxonhill.dnd5eapi.rule.application.usecase.LoadRules
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RuleTools(
    private val loadRule: LoadRule,
    private val loadRules: LoadRules
) {
    @Tool
    fun getRules() = loadRules.load()

    @Tool
    fun getRule(index: String) = loadRule.load(index)
}