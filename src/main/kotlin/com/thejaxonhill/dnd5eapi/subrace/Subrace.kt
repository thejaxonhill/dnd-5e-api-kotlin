package com.thejaxonhill.dnd5eapi.subrace

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice
import java.util.*

data class Subrace(
    val abilityBonuses: List<SubraceAbilityBonus>,
    val desc: String,
    val index: String,
    val languages: List<ApiReference>? = null,
    val languageOptions: Choice? = null,
    val name: String,
    val race: ApiReference,
    val racialTraits: List<ApiReference>,
    val startingProficiencies: List<ApiReference>? = null,
    val url: String,
    val updatedAt: Date,
)
