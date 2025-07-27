package com.thejaxonhill.dnd5eapi.spell.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.spell.domain.repository.SpellRepository

@UseCase
class LoadSpell(private val spellRepository: SpellRepository) {
    fun load(index: String) = spellRepository.loadByIndex(index) ?:
    throw NotFoundException()
}