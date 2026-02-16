package com.thejaxonhill.dnd5eapi.equipment.application.usecase

import com.thejaxonhill.dnd5eapi.equipment.application.dto.toView
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentExample
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadAllEquipment(private val equipmentRepository: EquipmentRepository) {
    fun load(page: Page, example: EquipmentExample?) =
        equipmentRepository.loadAll(page, example).map { it.toView() }
}