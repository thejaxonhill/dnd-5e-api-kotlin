package com.thejaxonhill.dnd5eapi.monster

data class ArmorClassDex(
    val value: Int,
    val desc: String? = null,
) : MonsterArmorClass("dex")
