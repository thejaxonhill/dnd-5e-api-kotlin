package com.thejaxonhill.dnd5eapi.rule.application.usecase

import com.thejaxonhill.dnd5eapi.rule.application.dto.toView
import com.thejaxonhill.dnd5eapi.rule.domain.repository.RuleRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRuleByIndex(private val ruleRepository: RuleRepository) {
    fun load(index: String) = ruleRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}