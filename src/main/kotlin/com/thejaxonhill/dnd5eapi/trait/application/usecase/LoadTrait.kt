package com.thejaxonhill.dnd5eapi.trait.application.usecase


import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.trait.domain.repository.TraitRepository

@UseCase
class LoadTrait(private val traitRepository: TraitRepository) {
    fun load(index: String) = traitRepository.loadByIndex(index) ?: throw NoSuchElementException()
}