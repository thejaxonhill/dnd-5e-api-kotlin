package com.thejaxonhill.dnd5eapi.equipment.application.usecase

import com.thejaxonhill.dnd5eapi.equipment.application.dto.toView
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class SearchEquipment(private val equipmentRepository: EquipmentRepository) {
    fun search(page: Page, query: String?) =
        equipmentRepository.loadAll(page, query).map { it.toView()}
}