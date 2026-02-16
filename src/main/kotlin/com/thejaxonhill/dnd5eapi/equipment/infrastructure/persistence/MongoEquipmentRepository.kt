package com.thejaxonhill.dnd5eapi.equipment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.equipment.domain.Equipment
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentExample
import com.thejaxonhill.dnd5eapi.equipment.domain.EquipmentRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoEquipmentRepository(private val repository: EquipmentMongoRepository) : EquipmentRepository {
    override fun load(id: String): Equipment? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Equipment? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: EquipmentExample?): PagedModel<Equipment> =
        repository.findAll(
            Example.of(example?.toEquipmentDocument() ?: EquipmentDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(equipment: Equipment) = repository.save(equipment.toDocument()).toDomain()
}

fun EquipmentDocument.toDomain() = Equipment(
    id = id,
    armorCategory = armorCategory,
    armorClass = armorClass,
    capacity = capacity,
    categoryRange = categoryRange,
    contents = contents,
    cost = cost!!,
    damage = damage,
    desc = desc,
    equipmentCategory = equipmentCategory!!,
    gearCategory = gearCategory,
    index = index!!,
    name = name!!,
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
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Equipment.toDocument() = EquipmentDocument(
    id = id,
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

fun EquipmentExample.toEquipmentDocument(): EquipmentDocument = EquipmentDocument(
    name = name
)
