package com.thejaxonhill.dnd5eapi.monster

data class ArmorClassNatural(
    val value: Int,
    val desc: String? = null,
) : MonsterArmorClass("natural")
