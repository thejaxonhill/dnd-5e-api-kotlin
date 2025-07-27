package com.thejaxonhill.dnd5eapi.damagetype.domain.model

import java.util.*

data class DamageType(
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)
