package com.thejaxonhill.dnd5eapi.equipment.domain.repository

import com.thejaxonhill.dnd5eapi.equipment.domain.model.Equipment
import com.thejaxonhill.dnd5eapi.equipment.domain.model.EquipmentExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface EquipmentRepository {
    fun load(id: String): Equipment?
    fun loadByIndex(index: String): Equipment?
    fun loadAll(page: Page, example: EquipmentExample? = null): PagedModel<Equipment>
    fun save(equipment: Equipment): Equipment
}