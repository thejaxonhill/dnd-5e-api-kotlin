package com.thejaxonhill.dnd5eapi.characterclass.application.dto

import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.Spellcasting
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.EquipmentQuantity
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.MultiClassing
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class CharacterClassView(
    val classLevels: String,
    val hitDie: Int,
    val index: String,
    val name: String,
    val proficiencies: List<ApiReference>,
    val proficiencyChoices: List<Choice>,
    val savingThrows: List<ApiReference>,
    val spellcasting: Spellcasting?,
    val spells: String?,
    val startingEquipment: List<EquipmentQuantity>?,
    val startingEquipmentOptions: List<Choice>,
    val multiClassing: MultiClassing,
    val subclasses: List<ApiReference>,
    val url: String,
)

fun CharacterClass.toView() = CharacterClassView(
    classLevels = classLevels,
    hitDie = hitDie,
    index = index,
    name = name,
    proficiencies = proficiencies,
    proficiencyChoices = proficiencyChoices,
    savingThrows = savingThrows,
    spellcasting = spellcasting,
    spells = spells,
    startingEquipment = startingEquipment,
    startingEquipmentOptions = startingEquipmentOptions,
    multiClassing = multiClassing,
    subclasses = subclasses,
    url = url,
)
