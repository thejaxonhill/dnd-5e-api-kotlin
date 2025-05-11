package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class ArmorClassArmor(
    val value: Int,
    val armor: List<ApiReference>? = null,
    val desc: String? = null,
) : MonsterArmorClass("armor")
