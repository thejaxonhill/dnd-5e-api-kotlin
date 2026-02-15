package com.thejaxonhill.dnd5eapi.equipmentcategory.application.dto

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategory
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class EquipmentCategoryView(
    val equipment: List<ApiReference>,
    val index: String,
    val name: String,
    val url: String,
)

fun EquipmentCategory.toView() = EquipmentCategoryView(
    equipment = equipment,
    index = index,
    name = name,
    url = url,
)
