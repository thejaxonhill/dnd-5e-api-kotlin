package com.thejaxonhill.dnd5eapi.skill.persistence

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "skills")
class SkillDocument(
    @Id
    val id: String? = null,
    val abilityScore: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)
