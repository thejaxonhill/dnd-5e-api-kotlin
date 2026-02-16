package com.thejaxonhill.dnd5eapi.monster.application.dto

import com.thejaxonhill.dnd5eapi.monster.domain.LegendaryAction
import com.thejaxonhill.dnd5eapi.monster.domain.Monster
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterAction
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterArmorClass
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterProficiency
import com.thejaxonhill.dnd5eapi.monster.domain.Reaction
import com.thejaxonhill.dnd5eapi.monster.domain.Sense
import com.thejaxonhill.dnd5eapi.monster.domain.SpecialAbility
import com.thejaxonhill.dnd5eapi.monster.domain.Speed
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class MonsterView(
    val actions: List<MonsterAction>? = null,
    val alignment: String,
    val armorClass: List<MonsterArmorClass>,
    val challengeRating: Double,
    val charisma: Int,
    val conditionImmunities: List<ApiReference>,
    val constitution: Int,
    val damageImmunities: List<String>,
    val damageResistances: List<String>,
    val damageVulnerabilities: List<String>,
    val dexterity: Int,
    val forms: List<ApiReference>? = null,
    val hitDice: String,
    val hitPoints: Int,
    val hitPointsRoll: String,
    val image: String? = null,
    val index: String,
    val intelligence: Int,
    val languages: String,
    val legendaryActions: List<LegendaryAction>? = null,
    val name: String,
    val proficiencies: List<MonsterProficiency>,
    val reactions: List<Reaction>? = null,
    val senses: Sense,
    val size: String,
    val specialAbilities: List<SpecialAbility>? = null,
    val speed: Speed,
    val strength: Int,
    val subtype: String? = null,
    val type: String,
    val url: String,
    val wisdom: Int,
    val xp: Long,
)

fun Monster.toView() = MonsterView(
    actions = actions,
    alignment = alignment,
    armorClass = armorClass,
    challengeRating = challengeRating,
    charisma = charisma,
    conditionImmunities = conditionImmunities,
    constitution = constitution,
    damageImmunities = damageImmunities,
    damageResistances = damageResistances,
    damageVulnerabilities = damageVulnerabilities,
    dexterity = dexterity,
    forms = forms,
    hitDice = hitDice,
    hitPoints = hitPoints,
    hitPointsRoll = hitPointsRoll,
    image = image,
    index = index,
    intelligence = intelligence,
    languages = languages,
    legendaryActions = legendaryActions,
    name = name,
    proficiencies = proficiencies,
    reactions = reactions,
    senses = senses,
    size = size,
    specialAbilities = specialAbilities,
    speed = speed,
    strength = strength,
    subtype = subtype,
    type = type,
    url = url,
    wisdom = wisdom,
    xp = xp,
)
