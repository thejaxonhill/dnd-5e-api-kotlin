package com.thejaxonhill.dnd5eapi.trait.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass
import java.time.LocalDateTime

data class Trait(
    val id: String? = null,
    val desc: List<String>,
    val index: String,
    val name: String,
    val proficiencies: List<TraitProficiency>? = null,
    val proficiencyChoices: Choice?,
    val languageOptions: Choice? = null,
    val races: List<ApiReference>,
    val subraces: List<ApiReference>,
    val parent: ApiReference?,
    val traitSpecific: TraitSpecific? = null,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class TraitExample(val name: String?)
data class ActionDamage(
    val damageType: ApiReference,
    val damageAtCharacterLevel: Map<String, String>,
)

data class TraitProficiency(
    val index: String,
    val name: String,
    val url: String,
)

data class TraitSpecific(
    val subtraitOptions: Choice? = null,
    val spellOptions: Choice? = null,
    val damageType: ApiReference? = null,
    val breathWeapon: TraitSpecificAction? = null,
)

data class TraitSpecificAction(
    val name: String,
    val desc: String,
    val usage: Usage,
    val dc: DifficultyClass,
    val damage: List<ActionDamage>,
    val areaOfEffect: AreaOfEffect,
)

data class Usage(
    val type: String,
    val times: Int,
)