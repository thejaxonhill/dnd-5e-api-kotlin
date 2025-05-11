package com.thejaxonhill.dnd5eapi.equipmentcategory.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.port.LoadEquipmentCategoryPort
import org.springframework.stereotype.Service

@Service
class LoadEquipmentCategories(private val loadEquipmentCategoryPort: LoadEquipmentCategoryPort) {
    fun load() = loadEquipmentCategoryPort.loadAll()
}