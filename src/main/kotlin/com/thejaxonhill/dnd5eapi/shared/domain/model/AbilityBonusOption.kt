package com.thejaxonhill.dnd5eapi.shared.domain.model

data class AbilityBonusOption(
    val abilityScore: ApiReference,
    val bonus: Int
) : Option("ability_bonus")