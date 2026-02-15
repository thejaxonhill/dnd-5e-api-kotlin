package com.thejaxonhill.dnd5eapi.condition.application.usecase

import com.thejaxonhill.dnd5eapi.condition.application.dto.toView
import com.thejaxonhill.dnd5eapi.condition.domain.repository.ConditionRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadConditionByIndex(private val conditionRepository: ConditionRepository) {
    fun load(index: String) = conditionRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}