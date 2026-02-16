package com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.application.dto.toView
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.EquipmentCategoryRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadEquipmentCategoryByIndex(private val equipmentCategoryRepository: EquipmentCategoryRepository) {
    fun load(index: String) = equipmentCategoryRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}