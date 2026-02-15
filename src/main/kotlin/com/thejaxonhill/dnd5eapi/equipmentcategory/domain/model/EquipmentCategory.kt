package com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class EquipmentCategory(
    val id: String? = null,
    val equipment: List<ApiReference>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: LocalDateTime
)

data class EquipmentCategoryExample(val name: String? = null)
