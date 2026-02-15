package com.thejaxonhill.dnd5eapi.language.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "languages")
data class LanguageDocument(
    @Id
    val id: String? = null,
    val desc: String? = null,
    val index: String? = null,
    val name: String? = null,
    val script: String? = null,
    val type: String? = null,
    val typicalSpeakers: List<String>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)