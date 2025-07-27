package com.thejaxonhill.dnd5eapi.trait.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.trait.domain.repository.TraitRepository

@UseCase
class LoadTraits(private val traitRepository: TraitRepository) {
    fun load() = traitRepository.loadAll()
}