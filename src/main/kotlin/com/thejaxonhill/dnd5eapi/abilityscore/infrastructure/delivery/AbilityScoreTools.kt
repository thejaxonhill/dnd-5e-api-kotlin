package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScoreByIndex
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScores
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class AbilityScoreTools(
    private val loadAbilityScoreByIndex: LoadAbilityScoreByIndex,
    private val loadAbilityScores: LoadAbilityScores
) {
    @Tool
    fun getAbilityScores( page: Page, abilityScoreExample: AbilityScoreExample? = null) =
        loadAbilityScores.load(page, abilityScoreExample)

    @Tool
    fun getAbilityScore(index: String) = loadAbilityScoreByIndex.load(index)
}