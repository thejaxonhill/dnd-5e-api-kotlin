package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "equipment-categories")
class EquipmentCategoryDocument(
    @Id
    var id: String? = null,
    var equipment: List<ApiReference>? = null,
    var index: String? = null,
    var name: String? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)