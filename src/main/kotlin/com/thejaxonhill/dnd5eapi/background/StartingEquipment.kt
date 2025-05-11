package com.thejaxonhill.dnd5eapi.background

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class StartingEquipment(
    val equipment: ApiReference,
    val quantity: Int,
)
