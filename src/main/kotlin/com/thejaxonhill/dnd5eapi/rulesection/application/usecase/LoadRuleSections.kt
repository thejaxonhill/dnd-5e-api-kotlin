package com.thejaxonhill.dnd5eapi.rulesection.application.usecase

import com.thejaxonhill.dnd5eapi.rulesection.application.dto.toView
import com.thejaxonhill.dnd5eapi.rulesection.domain.model.RuleSectionExample
import com.thejaxonhill.dnd5eapi.rulesection.domain.repository.RuleSectionRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadRuleSections(private val ruleSectionRepository: RuleSectionRepository) {
    fun load(page: Page, example: RuleSectionExample?) =
        ruleSectionRepository.loadAll(page, example).map { it.toView() }
}