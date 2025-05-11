package com.thejaxonhill.dnd5eapi.language.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "languages")
class LanguageDocument(
    @Id
    val id: String? = null,
    val desc: String? = null,
    val index: String,
    val name: String,
    val script: String? = null,
    val type: String,
    val typicalSpeakers: List<String>,
    val url: String,
    val updatedAt: Date,
)