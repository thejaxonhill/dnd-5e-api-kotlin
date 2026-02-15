package com.thejaxonhill.dnd5eapi.equipmentcategory.application.usecase

import com.thejaxonhill.dnd5eapi.equipmentcategory.application.dto.toView
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategoryExample
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository.EquipmentCategoryRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadEquipmentCategories(private val equipmentCategoryRepository: EquipmentCategoryRepository) {
    fun load(page: Page, example: EquipmentCategoryExample?) =
        equipmentCategoryRepository.loadAll(page, example).map { it.toView() }
}