package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class MonsterProficiency(
    val proficiency: ApiReference,
    val value: Int,
)