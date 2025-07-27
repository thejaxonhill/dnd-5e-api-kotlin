package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class ArmorClassArmor(
    val value: Int,
    val armor: List<ApiReference>? = null,
    val desc: String? = null,
) : MonsterArmorClass("armor")
