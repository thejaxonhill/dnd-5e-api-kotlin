package com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategory
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategoryExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface EquipmentCategoryRepository {
    fun load(id: String): EquipmentCategory?
    fun loadByIndex(index: String): EquipmentCategory?
    fun loadAll(page: Page, example: EquipmentCategoryExample? = null): PagedModel<EquipmentCategory>
    fun save(equipmentCategory: EquipmentCategory): EquipmentCategory
}
