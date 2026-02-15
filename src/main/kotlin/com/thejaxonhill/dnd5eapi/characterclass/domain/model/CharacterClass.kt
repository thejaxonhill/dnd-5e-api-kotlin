package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import java.time.LocalDateTime

data class CharacterClass(
    val id: String? = null,
    val classLevels: String? = null,
    val hitDie: Int? = null,
    val index: String,
    val name: String? = null,
    val proficiencies: List<ApiReference>? = null,
    val proficiencyChoices: List<Choice>? = null,
    val savingThrows: List<ApiReference>? = null,
    val spellcasting: Spellcasting? = null,
    val spells: String? = null,
    val startingEquipment: List<EquipmentQuantity>? = null,
    val startingEquipmentOptions: List<Choice>? = null,
    val multiClassing: MultiClassing? = null,
    val subclasses: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: LocalDateTime? = null,
)

data class CharacterClassExample(val name: String? = null)

data class Spellcasting(
    val info: List<SpellcastingInfo>,
    val level: Int,
    val spellcastingAbility: ApiReference
)

data class EquipmentQuantity(
    val equipment: ApiReference,
    val quantity: Int
)

data class MultiClassing(
    val prerequisites: List<MultiClassingPrerequisite>? = null,
    val prerequisiteOptions: Choice? = null,
    val proficiencies: List<ApiReference>? = null,
    val proficiencyChoices: List<Choice>? = null,
)

data class MultiClassingPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)

data class SpellcastingInfo(
    val desc: List<String>,
    val name: String,
)