package com.thejaxonhill.dnd5eapi.weaponproperty.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponProperty
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponPropertyExample

interface WeaponPropertyRepository {
    fun load(id: String): WeaponProperty?
    fun loadByIndex(index: String): WeaponProperty?
    fun loadAll(page: Page, example: WeaponPropertyExample? = null): PagedModel<WeaponProperty>
    fun save(weaponProperty: WeaponProperty): WeaponProperty
}
