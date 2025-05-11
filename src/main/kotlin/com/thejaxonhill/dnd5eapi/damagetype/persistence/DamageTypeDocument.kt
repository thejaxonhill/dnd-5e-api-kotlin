package com.thejaxonhill.dnd5eapi.damagetype.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "damage-types")
class DamageTypeDocument(
    @Id
    val id: String? = null,
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)