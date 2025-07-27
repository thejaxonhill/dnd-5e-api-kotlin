package com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository.LoadEquipmentCategoryPort
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadEquipmentCategories(private val loadEquipmentCategoryPort: LoadEquipmentCategoryPort) {
    fun load() = loadEquipmentCategoryPort.loadAll()
}