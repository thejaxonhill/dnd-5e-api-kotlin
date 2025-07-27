package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategory
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository.LoadEquipmentCategoryPort
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class EquipmentCategoryMongoAdapter(repository: EquipmentCategoryMongoRepository) :
    MongoAdapter<EquipmentCategory, EquipmentCategoryDocument>(repository),
    LoadEquipmentCategoryPort {
    override fun EquipmentCategoryDocument.toDomain() = EquipmentCategory(
        equipment = equipment,
        index = index,
        name = name,
        url = url,
        updatedAt = updatedAt,
    )
}