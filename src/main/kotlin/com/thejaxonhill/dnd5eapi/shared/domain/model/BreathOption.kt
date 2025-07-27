package com.thejaxonhill.dnd5eapi.shared.domain.model

data class BreathOption(
    val name: String,
    val dt: DifficultyClass? = null,
    val damage: List<Damage>? = null,
) : Option("breath")
