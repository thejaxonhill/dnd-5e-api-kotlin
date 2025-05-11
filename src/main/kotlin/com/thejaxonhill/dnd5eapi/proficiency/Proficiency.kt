package com.thejaxonhill.dnd5eapi.proficiency

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class Proficiency(
    val classes: List<ApiReference>? = null,
    val index: String,
    val name: String,
    val races: List<ApiReference>? = null,
    val reference: ApiReference,
    val type: String,
    val url: String,
    val updatedAt: String,
)
