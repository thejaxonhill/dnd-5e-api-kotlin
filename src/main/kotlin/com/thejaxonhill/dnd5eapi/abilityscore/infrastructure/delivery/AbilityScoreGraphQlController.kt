package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScores
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AbilityScoreGraphQlController(
    private val loadAbilityScore: LoadAbilityScore,
    private val loadAbilityScores: LoadAbilityScores
) {
    @QueryMapping
    fun getAbilityScores() = loadAbilityScores.load()

    @QueryMapping
    fun getAbilityScoreByIndex(@Argument index: String) = loadAbilityScore.load(index)
}