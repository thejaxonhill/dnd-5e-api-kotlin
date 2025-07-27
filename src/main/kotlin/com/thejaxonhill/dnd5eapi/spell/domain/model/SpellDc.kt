package com.thejaxonhill.dnd5eapi.spell.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class SpellDc(
    val dcType: ApiReference,
    val dcSuccess: String,
    val desc: String? = null,
)
