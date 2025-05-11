package com.thejaxonhill.dnd5eapi.shared.model

data class DamageOption(
    val damageType: ApiReference,
    val damageDice: String,
    val notes: String
) : Option("damage")
