package com.thejaxonhill.dnd5eapi.abilityscore.application.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.application.dto.AbilityScoreExample
import com.thejaxonhill.dnd5eapi.abilityscore.domain.model.AbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.domain.repository.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import org.springframework.data.domain.Pageable

@UseCase
class LoadAbilityScores(private val abilityScoreRepository: AbilityScoreRepository) {
    fun load(abilityScoreExample: AbilityScoreExample, pageable: Pageable) = abilityScoreRepository.loadAll(AbilityScore(
        fullName = abilityScoreExample.fullName,
        name = abilityScoreExample.name,
        url = abilityScoreExample.url,
    ), pageable)
}