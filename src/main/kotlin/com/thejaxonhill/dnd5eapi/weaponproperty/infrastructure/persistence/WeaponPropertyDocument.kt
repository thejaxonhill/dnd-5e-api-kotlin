package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "weapon-properties")
data class WeaponPropertyDocument(
    @Id
    val id: String? = null,
    val desc: List<String>? = null,
    val index: String? = null,
    val name: String? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)