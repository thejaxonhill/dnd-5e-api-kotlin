package com.thejaxonhill.dnd5eapi.characterclass.application.usecase

import com.thejaxonhill.dnd5eapi.characterclass.application.dto.toView
import com.thejaxonhill.dnd5eapi.characterclass.domain.repository.CharacterClassRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadCharacterClassByIndex(private val characterClassRepository: CharacterClassRepository) {
    fun load(index: String) = characterClassRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}