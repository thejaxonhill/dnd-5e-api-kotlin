package com.thejaxonhill.dnd5eapi.rulesection.application.usecase

import com.thejaxonhill.dnd5eapi.rulesection.domain.repository.RuleSectionRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRuleSections(private val ruleSectionRepository: RuleSectionRepository) {
    fun load() = ruleSectionRepository.loadAll()
}