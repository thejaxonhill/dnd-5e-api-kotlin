package com.thejaxonhill.dnd5eapi.equipmentcategory.port

import com.thejaxonhill.dnd5eapi.equipmentcategory.EquipmentCategory

interface LoadEquipmentCategoryPort {
    fun loadByIndex(index: String): EquipmentCategory?
    fun loadAll(): List<EquipmentCategory>
}