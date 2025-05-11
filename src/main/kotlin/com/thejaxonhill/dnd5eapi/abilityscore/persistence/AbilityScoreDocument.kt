package com.thejaxonhill.dnd5eapi.abilityscore.persistence

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "ability-scores")
class AbilityScoreDocument(
    @Id
    val id: String? = null,
    val desc: List<String>,
    val fullName: String,
    val index: String,
    val name: String,
    val skills: List<ApiReference>,
    val url: String,
    val updatedAt: Date
)