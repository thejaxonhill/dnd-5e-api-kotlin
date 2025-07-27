package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class MonsterProficiency(
    val proficiency: ApiReference,
    val value: Int,
)