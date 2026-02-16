package com.thejaxonhill.dnd5eapi.magicitem.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface MagicItemRepository {
    fun load(id: String): MagicItem?
    fun loadByIndex(index: String): MagicItem?
    fun loadAll(page: Page, example: MagicItemExample? = null): PagedModel<MagicItem>
    fun save(magicItem: MagicItem): MagicItem
}