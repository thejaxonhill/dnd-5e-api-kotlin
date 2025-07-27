package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass

data class Reaction(
    val name: String,
    val desc: String,
    val dc: DifficultyClass? = null,
)