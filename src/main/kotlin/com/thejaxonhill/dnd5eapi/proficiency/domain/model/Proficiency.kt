package com.thejaxonhill.dnd5eapi.proficiency.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class Proficiency(
    val id: String? = null,
    val classes: List<ApiReference>? = null,
    val index: String,
    val name: String,
    val races: List<ApiReference>? = null,
    val reference: ApiReference,
    val type: String,
    val url: String,
    val updatedAt: String,
)

data class ProficiencyExample(val name: String?)
