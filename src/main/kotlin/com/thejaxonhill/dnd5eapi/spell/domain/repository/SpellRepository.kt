package com.thejaxonhill.dnd5eapi.spell.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.spell.domain.model.Spell
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellExample

interface SpellRepository {
    fun load(id: String): Spell?
    fun loadByIndex(index: String): Spell?
    fun loadAll(page: Page, example: SpellExample? = null): PagedModel<Spell>
    fun save(spell: Spell): Spell
}