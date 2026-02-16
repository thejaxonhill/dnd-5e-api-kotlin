package com.thejaxonhill.dnd5eapi.feat.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface FeatRepository {
    fun load(id: String): Feat?
    fun loadByIndex(index: String): Feat?
    fun loadAll(page: Page, example: FeatExample? = null): PagedModel<Feat>
    fun save(feat: Feat): Feat
}