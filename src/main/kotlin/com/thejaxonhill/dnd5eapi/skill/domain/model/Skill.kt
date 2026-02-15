package com.thejaxonhill.dnd5eapi.skill.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.util.*

data class Skill(
    val id: String? = null,
    val abilityScore: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)

data class SkillExample(val name: String? = null)
