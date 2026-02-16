package com.thejaxonhill.dnd5eapi.equipment.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface EquipmentRepository {
    fun load(id: String): Equipment?
    fun loadByIndex(index: String): Equipment?
    fun loadAll(page: Page, example: EquipmentExample? = null): PagedModel<Equipment>
    fun save(equipment: Equipment): Equipment
}