package com.thejaxonhill.dnd5eapi.characterclass.application.usecase

import com.thejaxonhill.dnd5eapi.characterclass.domain.repository.CharacterClassRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadCharacterClasses(private val characterClassRepository: CharacterClassRepository) {
    fun load() = characterClassRepository.loadAll()
}