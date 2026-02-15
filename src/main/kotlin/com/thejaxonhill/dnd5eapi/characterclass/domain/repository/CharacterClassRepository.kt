package com.thejaxonhill.dnd5eapi.characterclass.domain.repository

import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClassExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface CharacterClassRepository {
    fun load(id: String): CharacterClass?
    fun loadByIndex(index: String): CharacterClass?
    fun loadAll(page: Page, example: CharacterClassExample? = null): PagedModel<CharacterClass>
    fun save(characterClass: CharacterClass): CharacterClass
}