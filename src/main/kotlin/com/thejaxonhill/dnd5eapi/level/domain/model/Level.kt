package com.thejaxonhill.dnd5eapi.level.domain.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class Level(
    val id: String? = null,
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
    val updatedAt: LocalDateTime,
)

data class LevelExample(val level: Int?)
