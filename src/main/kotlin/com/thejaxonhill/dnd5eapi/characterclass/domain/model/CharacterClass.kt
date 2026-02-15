package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import java.util.*

data class CharacterClass(
    val id: String? = null,
    val classLevels: String,
    val hitDie: Int,
    val index: String,
    val name: String,
    val proficiencies: List<ApiReference>,
    val proficiencyChoices: List<Choice>,
    val savingThrows: List<ApiReference>,
    val spellcasting: CharacterClassSpellcasting?,
    val spells: String?,
    val startingEquipment: List<EquipmentQuantity>?,
    val startingEquipmentOptions: List<Choice>,
    val multiClassing: MultiClassing,
    val subclasses: List<ApiReference>,
    val url: String,
    val updatedAt: Date
)

data class CharacterClassExample(val name: String? = null)
