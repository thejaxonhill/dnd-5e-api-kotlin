package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.shared.domain.model.Damage
import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass

data class MonsterAction(
    val name: String,
    val desc: String,
    val attackBonus: Long? = null,
    val damage: List<Damage>? = null,
    val dc: DifficultyClass? = null,
    val options: Choice? = null,
    val usage: ActionUsage? = null,
    val multiattackType: String? = null,
    val actions: List<ActionOption>? = null,
    val actionOptions: Choice? = null,
)