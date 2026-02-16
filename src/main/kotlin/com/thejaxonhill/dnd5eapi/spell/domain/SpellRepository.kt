package com.thejaxonhill.dnd5eapi.spell.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface SpellRepository {
    fun load(id: String): Spell?
    fun loadByIndex(index: String): Spell?
    fun loadAll(page: Page, example: SpellExample? = null): PagedModel<Spell>
    fun save(spell: Spell): Spell
}