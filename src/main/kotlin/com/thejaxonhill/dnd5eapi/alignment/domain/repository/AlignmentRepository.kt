package com.thejaxonhill.dnd5eapi.alignment.domain.repository

import com.thejaxonhill.dnd5eapi.alignment.domain.model.Alignment
import com.thejaxonhill.dnd5eapi.alignment.domain.model.AlignmentExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface AlignmentRepository {
    fun load(id: String): Alignment?
    fun loadByIndex(index: String): Alignment?
    fun loadAll(page: Page, example: AlignmentExample? = null): PagedModel<Alignment>
    fun save(alignment: Alignment): Alignment
}