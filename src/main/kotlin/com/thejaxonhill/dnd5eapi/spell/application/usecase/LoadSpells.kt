package com.thejaxonhill.dnd5eapi.spell.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.spell.domain.repository.SpellRepository

@UseCase
class LoadSpells(private val spellRepository: SpellRepository) {
    fun load() = spellRepository.loadAll()
}