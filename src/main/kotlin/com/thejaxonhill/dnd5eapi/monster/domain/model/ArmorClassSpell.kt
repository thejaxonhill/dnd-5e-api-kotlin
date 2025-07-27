package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class ArmorClassSpell(
    val value: Int,
    val spell: ApiReference,
    val desc: String? = null,
) : MonsterArmorClass("spell")
