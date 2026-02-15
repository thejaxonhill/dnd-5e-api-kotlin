package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "proficiencies")
data class ProficiencyDocument(
    @Id
    val id: String? = null,
    val classes: List<ApiReference>? = null,
    val index: String? = null,
    val name: String? = null,
    val races: List<ApiReference>? = null,
    val reference: ApiReference? = null,
    val type: String? = null,
    val url: String? = null,
    val updatedAt: String? = null
)