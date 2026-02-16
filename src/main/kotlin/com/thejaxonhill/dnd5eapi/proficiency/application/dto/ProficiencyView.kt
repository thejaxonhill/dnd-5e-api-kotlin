package com.thejaxonhill.dnd5eapi.proficiency.application.dto

import com.thejaxonhill.dnd5eapi.proficiency.domain.Proficiency
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class ProficiencyView(
    val classes: List<ApiReference>? = null,
    val index: String,
    val name: String,
    val races: List<ApiReference>? = null,
    val reference: ApiReference,
    val type: String,
    val url: String,
)

fun Proficiency.toView() = ProficiencyView(
    classes = classes,
    index = index,
    name = name,
    races = races,
    reference = reference,
    type = type,
    url = url,
)
