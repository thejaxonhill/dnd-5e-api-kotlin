package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class ArmorClassCondition(
    val value: Int,
    val condition: ApiReference,
    val desc: String? = null,
) : MonsterArmorClass("condition")
