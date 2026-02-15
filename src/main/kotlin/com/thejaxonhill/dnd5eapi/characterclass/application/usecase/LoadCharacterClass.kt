package com.thejaxonhill.dnd5eapi.characterclass.application.usecase

import com.thejaxonhill.dnd5eapi.characterclass.domain.repository.CharacterClassRepository

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadCharacterClass(private val characterClassRepository: CharacterClassRepository) {
    fun load(index: String) = characterClassRepository.loadByIndex(index) ?: throw NoSuchElementException()
}