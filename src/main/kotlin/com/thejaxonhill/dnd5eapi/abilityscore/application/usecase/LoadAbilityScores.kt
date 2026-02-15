package com.thejaxonhill.dnd5eapi.abilityscore.application.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.application.dto.toView
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreExample
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadAbilityScores(private val abilityScoreRepository: AbilityScoreRepository) {
    fun load(page: Page, example: AbilityScoreExample?) =
        abilityScoreRepository.loadAll(page, example).map { it.toView() }
}