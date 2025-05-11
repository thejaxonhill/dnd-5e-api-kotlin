package com.thejaxonhill.dnd5eapi.equipment.usecase

import com.thejaxonhill.dnd5eapi.equipment.port.LoadEquipmentPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadEquipment(private val loadEquipmentPort: LoadEquipmentPort) {
    fun load(index: String) = loadEquipmentPort.loadByIndex(index) ?: throw NotFoundException()
}