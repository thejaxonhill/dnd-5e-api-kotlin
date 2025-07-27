package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class EquipmentQuantity(
    val equipment: ApiReference,
    val quantity: Int
)