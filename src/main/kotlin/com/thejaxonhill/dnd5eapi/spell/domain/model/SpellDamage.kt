package com.thejaxonhill.dnd5eapi.spell.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class SpellDamage(
    val damageType: ApiReference? = null,
    val damageAtSlotLevel: Map<Int, String>? = null,
    val damageAtCharacterLevel: Map<Int, String>? = null,
)
