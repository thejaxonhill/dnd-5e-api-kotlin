package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.Damage
import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass

data class SpecialAbility(
    val name: String,
    val desc: String,
    val attackBonus: Int? = null,
    val damage: List<Damage>? = null,
    val dc: DifficultyClass? = null,
    val spellcasting: SpecialAbilitySpellcasting? = null,
    val usage: SpecialAbilityUsage? = null,
)
