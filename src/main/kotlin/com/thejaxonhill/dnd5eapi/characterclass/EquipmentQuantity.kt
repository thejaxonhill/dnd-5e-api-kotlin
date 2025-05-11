package com.thejaxonhill.dnd5eapi.characterclass

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class EquipmentQuantity(
    val equipment: ApiReference,
    val quantity: Int
)