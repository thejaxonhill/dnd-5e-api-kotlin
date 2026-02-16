package com.thejaxonhill.dnd5eapi.subrace.application.dto

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.subrace.domain.Subrace
import com.thejaxonhill.dnd5eapi.subrace.domain.AbilityBonus

data class SubraceView(
    val abilityBonuses: List<AbilityBonus>,
    val desc: String,
    val index: String,
    val languages: List<ApiReference>? = null,
    val languageOptions: Choice? = null,
    val name: String,
    val race: ApiReference,
    val racialTraits: List<ApiReference>,
    val startingProficiencies: List<ApiReference>? = null,
    val url: String,
)

fun Subrace.toView() = SubraceView(
    abilityBonuses = abilityBonuses,
    desc = desc,
    index = index,
    languages = languages,
    languageOptions = languageOptions,
    name = name,
    race = race,
    racialTraits = racialTraits,
    startingProficiencies = startingProficiencies,
    url = url,
)
