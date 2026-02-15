package com.thejaxonhill.dnd5eapi.abilityscore.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

class AbilityScore(
    val id: String? = null,
    val desc: List<String>? = null,
    val fullName: String? = null,
    val index: String? = null,
    val name: String? = null,
    val skills: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: LocalDateTime? = null
)

data class AbilityScoreExample(val name: String)
