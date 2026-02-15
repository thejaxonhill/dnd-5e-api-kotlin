package com.thejaxonhill.dnd5eapi.level.domain.repository

import com.thejaxonhill.dnd5eapi.level.domain.model.Level
import com.thejaxonhill.dnd5eapi.level.domain.model.LevelExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface LevelRepository {
    fun load(id: String): Level?
    fun loadByIndex(index: String): Level?
    fun loadAll(page: Page, example: LevelExample? = null): PagedModel<Level>
    fun save(level: Level): Level
}