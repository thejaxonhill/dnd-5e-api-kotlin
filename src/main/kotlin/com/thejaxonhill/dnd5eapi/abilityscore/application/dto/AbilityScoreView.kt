package com.thejaxonhill.dnd5eapi.abilityscore.application.dto

import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScore
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class AbilityScoreView(
    val desc: List<String>? = null,
    val fullName: String? = null,
    val index: String? = null,
    val name: String? = null,
    val skills: List<ApiReference>? = null,
    val url: String? = null,
)

fun AbilityScore.toView() = AbilityScoreView(
    desc = desc,
    fullName = fullName,
    index = index,
    name = name,
    skills = skills,
    url = url,
)