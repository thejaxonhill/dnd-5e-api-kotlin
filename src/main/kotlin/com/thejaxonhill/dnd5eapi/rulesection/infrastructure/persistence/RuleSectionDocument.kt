package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "rule-sections")
data class RuleSectionDocument(
    @Id
    val id: String? = null,
    val desc: String? = null,
    val index: String? = null,
    val name: String? = null,
    val url: String? = null,
    val updatedAt: String? = null
)