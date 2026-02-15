package com.thejaxonhill.dnd5eapi.equipment.application.usecase

import com.thejaxonhill.dnd5eapi.equipment.domain.repository.EquipmentRepository

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadEquipment(private val equipmentRepository: EquipmentRepository) {
    fun load(index: String) = equipmentRepository.loadByIndex(index) ?: throw NoSuchElementException()
}