package com.thejaxonhill.dnd5eapi.subrace.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.subrace.domain.model.Subrace
import com.thejaxonhill.dnd5eapi.subrace.domain.model.SubraceExample

interface SubraceRepository {
    fun load(id: String): Subrace?
    fun loadByIndex(index: String): Subrace?
    fun loadAll(page: Page, example: SubraceExample? = null): PagedModel<Subrace>
    fun save(subrace: Subrace): Subrace
}