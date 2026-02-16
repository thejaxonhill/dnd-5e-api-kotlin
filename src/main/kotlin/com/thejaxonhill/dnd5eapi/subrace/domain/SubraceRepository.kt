package com.thejaxonhill.dnd5eapi.subrace.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface SubraceRepository {
    fun load(id: String): Subrace?
    fun loadByIndex(index: String): Subrace?
    fun loadAll(page: Page, example: SubraceExample? = null): PagedModel<Subrace>
    fun save(subrace: Subrace): Subrace
}