package com.thejaxonhill.dnd5eapi.language.domain.model

import java.util.*

data class Language(
    val desc: String? = null,
    val index: String,
    val name: String,
    val script: String? = null,
    val type: String,
    val typicalSpeakers: List<String>,
    val url: String,
    val updatedAt: Date,
)
