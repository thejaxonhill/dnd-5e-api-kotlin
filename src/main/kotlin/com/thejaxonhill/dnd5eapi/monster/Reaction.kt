package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.DifficultyClass

data class Reaction(
    val name: String,
    val desc: String,
    val dc: DifficultyClass? = null,
)