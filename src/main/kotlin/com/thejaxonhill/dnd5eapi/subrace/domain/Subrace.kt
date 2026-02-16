package com.thejaxonhill.dnd5eapi.subrace.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import java.time.LocalDateTime

data class Subrace(
    val id: String? = null,
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
    val updatedAt: LocalDateTime,
)

data class SubraceExample(val name: String?)

data class AbilityBonus(
    val abilityScore: ApiReference,
    val bonus: Long,
)