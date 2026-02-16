package com.thejaxonhill.dnd5eapi.trait.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.trait.application.dto.toView
import com.thejaxonhill.dnd5eapi.trait.domain.TraitExample
import com.thejaxonhill.dnd5eapi.trait.domain.TraitRepository

@UseCase
class LoadTraits(private val traitRepository: TraitRepository) {
    fun load(page: Page, example: TraitExample?) =
        traitRepository.loadAll(page, example).map { it.toView() }
}