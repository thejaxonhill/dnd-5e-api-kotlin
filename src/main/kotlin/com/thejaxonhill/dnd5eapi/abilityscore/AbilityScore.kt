package com.thejaxonhill.dnd5eapi.abilityscore

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import java.util.*

data class AbilityScore(
    val desc: List<String>,
    val fullName: String,
    val index: String,
    val name: String,
    val skills: List<ApiReference>,
    val url: String,
    val updatedAt: Date
)
