package com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.util.*

data class EquipmentCategory(
    val equipment: List<ApiReference>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date
)
