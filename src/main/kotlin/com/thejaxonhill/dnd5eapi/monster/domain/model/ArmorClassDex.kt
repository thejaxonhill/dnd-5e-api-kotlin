package com.thejaxonhill.dnd5eapi.monster.domain.model

data class ArmorClassDex(
    val value: Int,
    val desc: String? = null,
) : MonsterArmorClass("dex")
