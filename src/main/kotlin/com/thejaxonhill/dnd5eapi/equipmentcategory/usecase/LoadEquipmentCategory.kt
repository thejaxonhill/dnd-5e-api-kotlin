package com.thejaxonhill.dnd5eapi.equipmentcategory.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.port.LoadEquipmentCategoryPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadEquipmentCategory(private val loadEquipmentCategoryPort: LoadEquipmentCategoryPort) {
    fun load(index: String) = loadEquipmentCategoryPort.loadByIndex(index) ?: throw NotFoundException()
}