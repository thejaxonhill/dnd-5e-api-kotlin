package com.thejaxonhill.dnd5eapi.damagetype.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "damage-types")
data class DamageTypeDocument(
    @Id
    val id: String? = null,
    val index: String? = null,
    val name: String? = null,
    val desc: List<String>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)