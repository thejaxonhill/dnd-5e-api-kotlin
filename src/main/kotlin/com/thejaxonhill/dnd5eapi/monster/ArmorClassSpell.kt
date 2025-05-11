package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class ArmorClassSpell(
    val value: Int,
    val spell: ApiReference,
    val desc: String? = null,
) : MonsterArmorClass("spell")
