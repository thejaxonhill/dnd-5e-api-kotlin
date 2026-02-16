package com.thejaxonhill.dnd5eapi.spell.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.spell.application.dto.toView
import com.thejaxonhill.dnd5eapi.spell.domain.SpellExample
import com.thejaxonhill.dnd5eapi.spell.domain.SpellRepository

@UseCase
class LoadSpells(private val spellRepository: SpellRepository) {
    fun load(page: Page, example: SpellExample?) =
        spellRepository.loadAll(page, example).map { it.toView() }
}