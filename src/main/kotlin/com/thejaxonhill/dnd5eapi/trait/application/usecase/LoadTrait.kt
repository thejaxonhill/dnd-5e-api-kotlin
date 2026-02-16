package com.thejaxonhill.dnd5eapi.trait.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.trait.application.dto.toView
import com.thejaxonhill.dnd5eapi.trait.domain.TraitRepository

@UseCase
class LoadTraitByIndex(private val traitRepository: TraitRepository) {
    fun load(index: String) = traitRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}