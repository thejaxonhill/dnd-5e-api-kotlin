package com.thejaxonhill.dnd5eapi.equipment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.equipment.domain.model.Equipment
import com.thejaxonhill.dnd5eapi.equipment.domain.repository.EquipmentRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class EquipmentMongoAdapter(repository: EquipmentMongoRepository) :
    MongoAdapter<Equipment, EquipmentDocument>(repository),
    EquipmentRepository {
    override fun EquipmentDocument.toDomain() = Equipment(
        armorCategory = armorCategory,
        armorClass = armorClass,
        capacity = capacity,
        categoryRange = categoryRange,
        contents = contents,
        cost = cost,
        damage = damage,
        desc = desc,
        equipmentCategory = equipmentCategory,
        gearCategory = gearCategory,
        index = index,
        name = name,
        properties = properties,
        quantity = quantity,
        range = range,
        special = special,
        speed = speed,
        stealthDisadvantage = stealthDisadvantage,
        strMinimum = strMinimum,
        throwRange = throwRange,
        toolCategory = toolCategory,
        twoHandedDamage = twoHandedDamage,
        vehicleCategory = vehicleCategory,
        weaponCategory = weaponCategory,
        weaponRange = weaponRange,
        weight = weight,
        url = url,
        updatedAt = updatedAt,
    )
}