package com.thejaxonhill.dnd5eapi.condition.application.usecase

import com.thejaxonhill.dnd5eapi.condition.domain.repository.ConditionRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadConditions(private val conditionRepository: ConditionRepository) {
    fun load() = conditionRepository.loadAll()
}