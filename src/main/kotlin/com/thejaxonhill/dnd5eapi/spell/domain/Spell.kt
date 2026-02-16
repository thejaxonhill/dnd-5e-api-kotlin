package com.thejaxonhill.dnd5eapi.spell.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import java.time.LocalDateTime

data class Spell(
    val id: String? = null,
    val areaOfEffect: AreaOfEffect? = null,
    val attackType: String? = null,
    val castingTime: String,
    val classes: List<ApiReference>,
    val components: List<String>,
    val concentration: Boolean,
    val damage: Damage? = null,
    val dc: SpellDc? = null,
    val desc: List<String>,
    val duration: String,
    val healAtSlotLevel: Map<Int, String>? = null,
    val higherLevel: List<String>? = null,
    val index: String,
    val level: Int,
    val material: String? = null,
    val name: String,
    val range: String,
    val ritual: Boolean,
    val school: ApiReference,
    val subclasses: List<ApiReference>,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class SpellExample(val name: String? )

data class Damage(
    val damageType: ApiReference? = null,
    val damageAtSlotLevel: Map<Int, String>? = null,
    val damageAtCharacterLevel: Map<Int, String>? = null,
)

data class SpellDc(
    val dcType: ApiReference,
    val dcSuccess: String,
    val desc: String? = null,
)