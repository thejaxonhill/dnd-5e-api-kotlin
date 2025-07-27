package com.thejaxonhill.dnd5eapi.abilityscore.application.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.domain.repository.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadAbilityScore(private val abilityScoreRepository: AbilityScoreRepository) {
    fun load(index: String) = abilityScoreRepository.loadByIndex(index) ?: throw NotFoundException()
}