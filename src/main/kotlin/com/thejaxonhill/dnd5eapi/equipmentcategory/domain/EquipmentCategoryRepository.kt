package com.thejaxonhill.dnd5eapi.equipmentcategory.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface EquipmentCategoryRepository {
    fun load(id: String): EquipmentCategory?
    fun loadByIndex(index: String): EquipmentCategory?
    fun loadAll(page: Page, example: EquipmentCategoryExample? = null): PagedModel<EquipmentCategory>
    fun save(equipmentCategory: EquipmentCategory): EquipmentCategory
}
