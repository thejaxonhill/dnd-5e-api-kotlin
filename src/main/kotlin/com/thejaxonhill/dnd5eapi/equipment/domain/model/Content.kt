package com.thejaxonhill.dnd5eapi.equipment.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class Content(
    val item: ApiReference,
    val quantity: Int,
)
