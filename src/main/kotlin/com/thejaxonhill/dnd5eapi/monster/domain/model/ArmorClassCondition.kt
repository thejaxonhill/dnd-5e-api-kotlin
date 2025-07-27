package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class ArmorClassCondition(
    val value: Int,
    val condition: ApiReference,
    val desc: String? = null,
) : MonsterArmorClass("condition")
