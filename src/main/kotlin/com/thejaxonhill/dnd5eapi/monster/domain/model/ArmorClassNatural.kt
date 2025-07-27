package com.thejaxonhill.dnd5eapi.monster.domain.model

data class ArmorClassNatural(
    val value: Int,
    val desc: String? = null,
) : MonsterArmorClass("natural")
