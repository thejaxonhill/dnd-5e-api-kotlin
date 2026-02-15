package com.thejaxonhill.dnd5eapi.subclass.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.subclass.domain.model.Subclass
import com.thejaxonhill.dnd5eapi.subclass.domain.model.SubclassExample

interface SubclassRepository {
    fun load(id: String): Subclass?
    fun loadByIndex(index: String): Subclass?
    fun loadAll(page: Page, example: SubclassExample? = null): PagedModel<Subclass>
    fun save(subclass: Subclass): Subclass
}