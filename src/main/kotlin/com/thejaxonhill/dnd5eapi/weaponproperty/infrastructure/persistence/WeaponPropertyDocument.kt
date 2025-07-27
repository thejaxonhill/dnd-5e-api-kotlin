package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "weapon-properties")
class WeaponPropertyDocument(
    @Id
    val id: String? = null,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)