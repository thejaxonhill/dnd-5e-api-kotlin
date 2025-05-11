package com.thejaxonhill.dnd5eapi.magicschool.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "magic-schools")
class MagicSchoolDocument(
    @Id
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)