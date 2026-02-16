package com.thejaxonhill.dnd5eapi.trait.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface TraitRepository {
    fun load(id: String): Trait?
    fun loadByIndex(index: String): Trait?
    fun loadAll(page: Page, example: TraitExample? = null): PagedModel<Trait>
    fun save(trait: Trait): Trait
}