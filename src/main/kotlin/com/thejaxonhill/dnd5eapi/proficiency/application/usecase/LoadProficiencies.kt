package com.thejaxonhill.dnd5eapi.proficiency.application.usecase

import com.thejaxonhill.dnd5eapi.proficiency.application.dto.toView
import com.thejaxonhill.dnd5eapi.proficiency.domain.ProficiencyExample
import com.thejaxonhill.dnd5eapi.proficiency.domain.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadProficiencies(private val proficiencyRepository: ProficiencyRepository) {
    fun load(page: Page, example: ProficiencyExample?) =
        proficiencyRepository.loadAll(page, example).map { it.toView() }
}