package com.thejaxonhill.dnd5eapi.equipment

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class Content(
    val item: ApiReference,
    val quantity: Int,
)
