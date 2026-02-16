package com.thejaxonhill.dnd5eapi.damagetype.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface DamageTypeRepository {
    fun load(id: String): DamageType?
    fun loadByIndex(index: String): DamageType?
    fun loadAll(page: Page, example: DamageTypeExample? = null): PagedModel<DamageType>
    fun save(damageType: DamageType): DamageType
}