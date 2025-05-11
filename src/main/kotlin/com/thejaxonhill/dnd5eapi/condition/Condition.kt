package com.thejaxonhill.dnd5eapi.condition

import java.util.*

data class Condition(
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)
