package com.thejaxonhill.dnd5eapi.equipment

data class ArmorClass(
    val base: Int,
    val dexBonus: Boolean,
    val maxBonus: Int? = null
)
