package com.thejaxonhill.dnd5eapi.subclass.domain

import com.fasterxml.jackson.annotation.JsonProperty
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class Subclass(
    val id: String? = null,
    @get:JsonProperty("class")
    val characterClass: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val spells: List<Spell>? = null,
    val subclassFlavor: String,
    val subclassLevels: String,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class SubclassExample(val name: String?)
data class Spell(
    val prerequisites: List<SpellPrerequisite>,
    val spell: ApiReference,
)

data class SpellPrerequisite(
    val index: String,
    val name: String,
    val type: String,
    val url: String,
)