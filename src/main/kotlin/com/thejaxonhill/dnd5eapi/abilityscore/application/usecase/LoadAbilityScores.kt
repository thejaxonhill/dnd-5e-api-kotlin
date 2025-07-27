package com.thejaxonhill.dnd5eapi.abilityscore.application.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.domain.repository.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadAbilityScores(private val abilityScoreRepository: AbilityScoreRepository) {
    fun load() = abilityScoreRepository.loadAll()
}