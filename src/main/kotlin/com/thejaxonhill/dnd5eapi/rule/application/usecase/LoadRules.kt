package com.thejaxonhill.dnd5eapi.rule.application.usecase

import com.thejaxonhill.dnd5eapi.rule.application.dto.toView
import com.thejaxonhill.dnd5eapi.rule.domain.RuleExample
import com.thejaxonhill.dnd5eapi.rule.domain.RuleRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadRules(private val ruleRepository: RuleRepository) {
    fun load(page: Page, example: RuleExample?) =
        ruleRepository.loadAll(page, example).map { it.toView() }
}