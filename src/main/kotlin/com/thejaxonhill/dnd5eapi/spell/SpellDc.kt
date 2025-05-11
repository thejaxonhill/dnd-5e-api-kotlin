package com.thejaxonhill.dnd5eapi.spell

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class SpellDc(
    val dcType: ApiReference,
    val dcSuccess: String,
    val desc: String? = null,
)
