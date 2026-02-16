package com.thejaxonhill.dnd5eapi.subclass.domain.model

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
    val spells: List<SubclassSpell>? = null,
    val subclassFlavor: String,
    val subclassLevels: String,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class SubclassExample(val name: String?)
