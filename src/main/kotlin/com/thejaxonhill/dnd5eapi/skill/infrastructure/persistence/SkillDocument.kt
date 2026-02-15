package com.thejaxonhill.dnd5eapi.skill.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "skills")
data class SkillDocument(
    @Id
    val id: String? = null,
    val abilityScore: ApiReference? = null,
    val desc: List<String>? = null,
    val index: String? = null,
    val name: String? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)
