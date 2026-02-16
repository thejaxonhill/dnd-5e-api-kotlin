package com.thejaxonhill.dnd5eapi.level.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface LevelRepository {
    fun load(id: String): Level?
    fun loadByIndex(index: String): Level?
    fun loadAll(page: Page, example: LevelExample? = null): PagedModel<Level>
    fun save(level: Level): Level
}