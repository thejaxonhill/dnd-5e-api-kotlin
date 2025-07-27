package com.thejaxonhill.dnd5eapi.proficiency.application.usecase

import com.thejaxonhill.dnd5eapi.proficiency.domain.repository.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadProficiency(private val proficiencyRepository: ProficiencyRepository) {
    fun load(index: String) = proficiencyRepository.loadByIndex(index) ?: throw NotFoundException()
}