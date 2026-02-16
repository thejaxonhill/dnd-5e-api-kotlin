package com.thejaxonhill.dnd5eapi.skill.application.dto

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.skill.domain.Skill

data class SkillView(
    val abilityScore: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
)

fun Skill.toView() = SkillView(
    abilityScore = abilityScore,
    desc = desc,
    index = index,
    name = name,
    url = url,
)
