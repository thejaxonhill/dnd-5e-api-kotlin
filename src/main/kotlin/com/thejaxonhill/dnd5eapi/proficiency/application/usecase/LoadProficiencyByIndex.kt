package com.thejaxonhill.dnd5eapi.proficiency.application.usecase

import com.thejaxonhill.dnd5eapi.proficiency.application.dto.toView
import com.thejaxonhill.dnd5eapi.proficiency.domain.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadProficiencyByIndex(private val proficiencyRepository: ProficiencyRepository) {
    fun load(index: String) = proficiencyRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}