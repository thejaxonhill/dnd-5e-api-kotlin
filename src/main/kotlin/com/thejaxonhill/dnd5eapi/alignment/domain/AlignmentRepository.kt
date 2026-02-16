package com.thejaxonhill.dnd5eapi.alignment.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface AlignmentRepository {
    fun load(id: String): Alignment?
    fun loadByIndex(index: String): Alignment?
    fun loadAll(page: Page, example: AlignmentExample? = null): PagedModel<Alignment>
    fun save(alignment: Alignment): Alignment
}