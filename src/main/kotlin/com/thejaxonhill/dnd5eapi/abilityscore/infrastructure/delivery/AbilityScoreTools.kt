package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScores
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class AbilityScoreTools(
    private val loadAbilityScore: LoadAbilityScore,
    private val loadAbilityScores: LoadAbilityScores
) {
    @Tool
    fun getAbilityScores() = loadAbilityScores.load()

    @Tool
    fun getAbilityScore(index: String) = loadAbilityScore.load(index)
}