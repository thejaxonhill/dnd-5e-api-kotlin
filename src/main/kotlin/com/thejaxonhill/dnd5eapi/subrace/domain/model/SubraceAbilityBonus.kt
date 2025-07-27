package com.thejaxonhill.dnd5eapi.subrace.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class SubraceAbilityBonus(
    val abilityScore: ApiReference,
    val bonus: Long,
)
