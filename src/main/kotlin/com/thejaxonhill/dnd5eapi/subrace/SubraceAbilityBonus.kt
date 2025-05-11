package com.thejaxonhill.dnd5eapi.subrace

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class SubraceAbilityBonus(
    val abilityScore: ApiReference,
    val bonus: Long,
)
