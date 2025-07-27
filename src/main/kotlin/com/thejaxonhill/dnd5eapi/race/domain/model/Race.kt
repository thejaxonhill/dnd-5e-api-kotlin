package com.thejaxonhill.dnd5eapi.race.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import java.util.*

data class Race(
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
    val updatedAt: Date,
)
