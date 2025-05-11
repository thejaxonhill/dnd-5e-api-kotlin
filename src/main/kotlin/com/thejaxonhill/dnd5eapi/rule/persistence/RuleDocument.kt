package com.thejaxonhill.dnd5eapi.rule.persistence

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "rules")
class RuleDocument(
    @Id
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val subsections: List<ApiReference>,
    val url: String,
    val updatedAt: Date,
)