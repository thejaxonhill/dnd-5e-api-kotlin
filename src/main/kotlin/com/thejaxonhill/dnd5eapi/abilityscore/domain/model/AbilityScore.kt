package com.thejaxonhill.dnd5eapi.abilityscore.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.util.*

data class AbilityScore(
    val desc: List<String>? = null,
    val fullName: String? = null,
    val index: String? = null,
    val name: String? = null,
    val skills: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)
