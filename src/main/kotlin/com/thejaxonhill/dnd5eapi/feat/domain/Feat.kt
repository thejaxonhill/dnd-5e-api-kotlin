package com.thejaxonhill.dnd5eapi.feat.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class Feat(
    val id: String? = null,
    val index: String,
    val name: String,
    val prerequisites: List<FeatPrerequisite>,
    val desc: List<String>,
    val url: String,
    val updatedAt: LocalDateTime
)

data class FeatExample(val name: String?)
data class FeatPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)