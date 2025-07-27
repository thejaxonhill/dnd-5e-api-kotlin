package com.thejaxonhill.dnd5eapi.race.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class RaceAbilityBonus(
    val abilityScore: ApiReference,
    val bonus: Long,
)
