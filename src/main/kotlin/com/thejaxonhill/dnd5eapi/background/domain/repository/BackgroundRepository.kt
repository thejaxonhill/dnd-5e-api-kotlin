package com.thejaxonhill.dnd5eapi.background.domain.repository

import com.thejaxonhill.dnd5eapi.background.domain.model.Background
import com.thejaxonhill.dnd5eapi.background.domain.model.BackgroundExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface BackgroundRepository {
    fun load(id: String): Background?
    fun loadByIndex(index: String): Background?
    fun loadAll(page: Page, example: BackgroundExample? = null): PagedModel<Background>
    fun save(background: Background): Background
}