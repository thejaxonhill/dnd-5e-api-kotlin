package com.thejaxonhill.dnd5eapi.equipment.domain.model

data class ArmorClass(
    val base: Int,
    val dexBonus: Boolean,
    val maxBonus: Int? = null
)
