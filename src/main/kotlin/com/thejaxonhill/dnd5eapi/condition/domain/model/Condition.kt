package com.thejaxonhill.dnd5eapi.condition.domain.model

import java.util.*

data class Condition(
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)
