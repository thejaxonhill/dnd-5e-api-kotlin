package com.thejaxonhill.dnd5eapi.background.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class StartingEquipment(
    val equipment: ApiReference,
    val quantity: Int,
)
