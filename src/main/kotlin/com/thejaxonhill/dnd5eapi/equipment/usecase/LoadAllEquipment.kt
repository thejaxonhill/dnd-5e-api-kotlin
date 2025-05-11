package com.thejaxonhill.dnd5eapi.equipment.usecase

import com.thejaxonhill.dnd5eapi.equipment.port.LoadEquipmentPort
import org.springframework.stereotype.Service

@Service
class LoadAllEquipment(private val loadEquipmentPort: LoadEquipmentPort) {
    fun load() = loadEquipmentPort.loadAll()
}