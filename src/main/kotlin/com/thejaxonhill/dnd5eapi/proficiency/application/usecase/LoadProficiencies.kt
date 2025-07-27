package com.thejaxonhill.dnd5eapi.proficiency.application.usecase

import com.thejaxonhill.dnd5eapi.proficiency.domain.repository.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadProficiencies(private val proficiencyRepository: ProficiencyRepository) {
    fun load() = proficiencyRepository.loadAll()
}