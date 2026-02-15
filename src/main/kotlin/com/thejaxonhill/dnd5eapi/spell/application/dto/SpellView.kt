package com.thejaxonhill.dnd5eapi.spell.application.dto

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.spell.domain.model.Spell
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDamage
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDc

data class SpellView(
    val areaOfEffect: AreaOfEffect? = null,
    val attackType: String? = null,
    val castingTime: String,
    val classes: List<ApiReference>,
    val components: List<String>,
    val concentration: Boolean,
    val damage: SpellDamage? = null,
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
)

fun Spell.toView() = SpellView(
    areaOfEffect = areaOfEffect,
    attackType = attackType,
    castingTime = castingTime,
    classes = classes,
    components = components,
    concentration = concentration,
    damage = damage,
    dc = dc,
    desc = desc,
    duration = duration,
    healAtSlotLevel = healAtSlotLevel,
    higherLevel = higherLevel,
    index = index,
    level = level,
    material = material,
    name = name,
    range = range,
    ritual = ritual,
    school = school,
    subclasses = subclasses,
    url = url,
)
