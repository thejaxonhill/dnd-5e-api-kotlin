package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSectionByIndex
import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSections
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RuleSectionTools(
    private val loadRuleSectionByIndex: LoadRuleSectionByIndex,
    private val loadRuleSections: LoadRuleSections
) {
    @Tool
    fun getRuleSections(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadRuleSections.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getRuleSection(index: String) = loadRuleSectionByIndex.load(index)
}