package com.thejaxonhill.dnd5eapi.equipment

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class TwoHandedDamage(
    val damageDice: String,
    val damageType: ApiReference
)
