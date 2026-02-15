package com.thejaxonhill.dnd5eapi.skill.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class Skill(
    val id: String? = null,
    val abilityScore: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class SkillExample(val name: String? = null)
