package com.thejaxonhill.dnd5eapi.race.application.dto

import com.thejaxonhill.dnd5eapi.race.domain.model.Race
import com.thejaxonhill.dnd5eapi.race.domain.model.RaceAbilityBonus
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class RaceView(
    val abilityBonusOptions: Choice? = null,
    val abilityBonuses: List<RaceAbilityBonus>,
    val age: String,
    val alignment: String,
    val index: String,
    val languageDesc: String,
    val languageOptions: Choice? = null,
    val languages: List<ApiReference>,
    val name: String,
    val size: String,
    val sizeDescription: String,
    val speed: Long,
    val startingProficiencies: List<ApiReference>? = null,
    val startingProficiencyOptions: Choice? = null,
    val subraces: List<ApiReference>? = null,
    val traits: List<ApiReference>? = null,
    val url: String,
)

fun Race.toView() = RaceView(
    abilityBonusOptions = abilityBonusOptions,
    abilityBonuses = abilityBonuses,
    age = age,
    alignment = alignment,
    index = index,
    languageDesc = languageDesc,
    languageOptions = languageOptions,
    languages = languages,
    name = name,
    size = size,
    sizeDescription = sizeDescription,
    speed = speed,
    startingProficiencies = startingProficiencies,
    startingProficiencyOptions = startingProficiencyOptions,
    subraces = subraces,
    traits = traits,
    url = url,
)
