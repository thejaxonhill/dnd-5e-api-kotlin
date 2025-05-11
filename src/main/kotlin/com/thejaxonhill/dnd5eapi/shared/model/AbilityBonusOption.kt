package com.thejaxonhill.dnd5eapi.shared.model

data class AbilityBonusOption(
    val abilityScore: ApiReference,
    val bonus: Int
) : Option("ability_bonus")