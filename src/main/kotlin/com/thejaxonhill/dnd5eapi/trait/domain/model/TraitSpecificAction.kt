package com.thejaxonhill.dnd5eapi.trait.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass

data class TraitSpecificAction(
    val name: String,
    val desc: String,
    val usage: Usage,
    val dc: DifficultyClass,
    val damage: List<ActionDamage>,
    val areaOfEffect: AreaOfEffect,
)
