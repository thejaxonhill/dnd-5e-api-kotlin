package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "rule-sections")
class RuleSectionDocument(
    @Id
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: String,
)