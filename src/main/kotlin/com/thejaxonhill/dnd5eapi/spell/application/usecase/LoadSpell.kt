package com.thejaxonhill.dnd5eapi.spell.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.spell.application.dto.toView
import com.thejaxonhill.dnd5eapi.spell.domain.repository.SpellRepository

@UseCase
class LoadSpellByIndex(private val spellRepository: SpellRepository) {
    fun load(index: String) = spellRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}