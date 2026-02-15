package com.thejaxonhill.dnd5eapi.damagetype.domain.model

import java.time.LocalDateTime

data class DamageType(
    val id: String? = null,
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: LocalDateTime
)

data class DamageTypeExample(val name: String? = null)
