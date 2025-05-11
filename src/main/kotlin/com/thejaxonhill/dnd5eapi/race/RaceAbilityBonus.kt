package com.thejaxonhill.dnd5eapi.race

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class RaceAbilityBonus(
    val abilityScore: ApiReference,
    val bonus: Long,
)
