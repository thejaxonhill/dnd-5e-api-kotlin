package com.thejaxonhill.dnd5eapi.equipmentcategory.persistence

import com.thejaxonhill.dnd5eapi.equipmentcategory.EquipmentCategory
import com.thejaxonhill.dnd5eapi.equipmentcategory.port.LoadEquipmentCategoryPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class EquipmentCategoryMongoAdapter(repository: EquipmentCategoryRepository) :
    MongoAdapter<EquipmentCategory>(repository, EquipmentCategory::class),
    LoadEquipmentCategoryPort