package com.thejaxonhill.dnd5eapi.condition.application.usecase

import com.thejaxonhill.dnd5eapi.condition.application.dto.toView
import com.thejaxonhill.dnd5eapi.condition.domain.model.ConditionExample
import com.thejaxonhill.dnd5eapi.condition.domain.repository.ConditionRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadConditions(private val conditionRepository: ConditionRepository) {
    fun load(page: Page, example: ConditionExample?) =
        conditionRepository.loadAll(page, example).map { it.toView() }
}