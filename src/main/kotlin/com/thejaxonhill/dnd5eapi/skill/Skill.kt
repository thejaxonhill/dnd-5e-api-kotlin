package com.thejaxonhill.dnd5eapi.skill

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import java.util.*

data class Skill(
    val abilityScore: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)
