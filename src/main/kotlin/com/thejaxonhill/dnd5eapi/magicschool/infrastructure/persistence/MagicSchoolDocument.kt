package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "magic-schools")
data class MagicSchoolDocument(
    @Id
    val id: String? = null,
    val desc: String? = null,
    val index: String? = null,
    val name: String? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)