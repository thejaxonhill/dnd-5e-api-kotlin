package com.thejaxonhill.dnd5eapi.characterclass.application.usecase

import com.thejaxonhill.dnd5eapi.characterclass.application.dto.toView
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClassExample
import com.thejaxonhill.dnd5eapi.characterclass.domain.repository.CharacterClassRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadCharacterClasses(private val characterClassRepository: CharacterClassRepository) {
    fun load(page: Page, example: CharacterClassExample?) =
        characterClassRepository.loadAll(page, example).map { it.toView() }
}