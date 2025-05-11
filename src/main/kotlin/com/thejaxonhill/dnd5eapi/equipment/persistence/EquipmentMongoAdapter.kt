package com.thejaxonhill.dnd5eapi.equipment.persistence

import com.thejaxonhill.dnd5eapi.equipment.Equipment
import com.thejaxonhill.dnd5eapi.equipment.port.LoadEquipmentPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class EquipmentMongoAdapter(repository: EquipmentRepository) :
    MongoAdapter<Equipment>(repository, Equipment::class),
    LoadEquipmentPort