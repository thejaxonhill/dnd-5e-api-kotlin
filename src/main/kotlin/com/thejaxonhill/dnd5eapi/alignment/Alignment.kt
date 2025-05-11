package com.thejaxonhill.dnd5eapi.alignment

import java.util.*

data class Alignment(
    val index: String,
    val name: String,
    val abbreviation: String,
    val desc: String,
    val url: String,
    val updatedAt: Date
)
