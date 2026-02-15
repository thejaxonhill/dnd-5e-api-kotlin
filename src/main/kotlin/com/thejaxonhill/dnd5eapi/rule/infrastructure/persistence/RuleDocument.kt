package com.thejaxonhill.dnd5eapi.rule.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "rules")
data class RuleDocument(
    @Id
    val id: String? = null,
    val desc: String? = null,
    val index: String? = null,
    val name: String? = null,
    val subsections: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)