package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "equipment-categories")
class EquipmentCategoryDocument(
    @Id
    val id: String? = null,
    val equipment: List<ApiReference>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date
)