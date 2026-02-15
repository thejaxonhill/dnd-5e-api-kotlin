package com.thejaxonhill.dnd5eapi.monster.domain.repository

import com.thejaxonhill.dnd5eapi.monster.domain.model.Monster
import com.thejaxonhill.dnd5eapi.monster.domain.model.MonsterExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface MonsterRepository {
    fun load(id: String): Monster?
    fun loadByIndex(index: String): Monster?
    fun loadAll(page: Page, example: MonsterExample? = null): PagedModel<Monster>
    fun save(monster: Monster): Monster
}