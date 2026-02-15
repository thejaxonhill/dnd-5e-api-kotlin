package com.thejaxonhill.dnd5eapi.language.domain.model

import java.time.LocalDateTime

data class Language(
    val id: String? = null,
    val desc: String? = null,
    val index: String,
    val name: String,
    val script: String? = null,
    val type: String,
    val typicalSpeakers: List<String>,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class LanguageExample(val name: String? = null)
