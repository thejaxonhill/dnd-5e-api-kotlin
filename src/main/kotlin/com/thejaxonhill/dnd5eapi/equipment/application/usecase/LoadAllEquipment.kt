package com.thejaxonhill.dnd5eapi.equipment.application.usecase

import com.thejaxonhill.dnd5eapi.equipment.domain.repository.EquipmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadAllEquipment(private val equipmentRepository: EquipmentRepository) {
    fun load() = equipmentRepository.loadAll()
}