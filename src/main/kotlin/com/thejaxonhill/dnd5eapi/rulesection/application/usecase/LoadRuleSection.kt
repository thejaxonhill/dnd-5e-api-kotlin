package com.thejaxonhill.dnd5eapi.rulesection.application.usecase

import com.thejaxonhill.dnd5eapi.rulesection.domain.repository.RuleSectionRepository

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRuleSection(private val ruleSectionRepository: RuleSectionRepository) {
    fun load(index: String) = ruleSectionRepository.loadByIndex(index) ?: throw NoSuchElementException()
}