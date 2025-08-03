package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSection
import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSections
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RuleSectionTools(
    private val loadRuleSection: LoadRuleSection,
    private val loadRuleSections: LoadRuleSections
) {
    @Tool
    fun getRuleSections() = loadRuleSections.load()

    @Tool
    fun getRuleSection(index: String) = loadRuleSection.load(index)
}