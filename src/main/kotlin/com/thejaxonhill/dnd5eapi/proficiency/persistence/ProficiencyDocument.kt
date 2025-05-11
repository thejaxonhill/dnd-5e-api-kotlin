package com.thejaxonhill.dnd5eapi.proficiency.persistence

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "proficiencies")
class ProficiencyDocument(
    @Id
    val id: String? = null,
    val classes: List<ApiReference>? = null,
    val index: String,
    val name: String,
    val races: List<ApiReference>? = null,
    val reference: ApiReference,
    val type: String,
    val url: String,
    val updatedAt: String,
)