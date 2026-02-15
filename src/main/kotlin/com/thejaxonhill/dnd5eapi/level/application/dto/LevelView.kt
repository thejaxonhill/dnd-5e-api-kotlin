package com.thejaxonhill.dnd5eapi.level.application.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.thejaxonhill.dnd5eapi.level.domain.model.ClassSpecific
import com.thejaxonhill.dnd5eapi.level.domain.model.Level
import com.thejaxonhill.dnd5eapi.level.domain.model.SpellcastingSlots
import com.thejaxonhill.dnd5eapi.level.domain.model.SubclassSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class LevelView(
    val abilityScoreBonuses: Long? = null,
    @get:JsonProperty("class")
    val characterClass: ApiReference,
    val classSpecific: ClassSpecific? = null,
    val features: List<ApiReference>,
    val index: String,
    val level: Int,
    val profBonus: Int? = null,
    val spellcasting: SpellcastingSlots? = null,
    val subclass: ApiReference?,
    val subclassSpecific: SubclassSpecific?,
    val url: String,
)

fun Level.toView() = LevelView(
    abilityScoreBonuses = abilityScoreBonuses,
    characterClass = characterClass,
    classSpecific = classSpecific,
    features = features,
    index = index,
    level = level,
    profBonus = profBonus,
    spellcasting = spellcasting,
    subclass = subclass,
    subclassSpecific = subclassSpecific,
    url = url,
)
