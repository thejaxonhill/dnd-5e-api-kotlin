package com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository.LoadEquipmentCategoryPort
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadEquipmentCategory(private val loadEquipmentCategoryPort: LoadEquipmentCategoryPort) {
    fun load(index: String) = loadEquipmentCategoryPort.loadByIndex(index) ?: throw NotFoundException()
}