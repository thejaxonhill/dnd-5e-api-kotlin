package com.thejaxonhill.dnd5eapi.subclass.application.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.subclass.domain.model.Subclass
import com.thejaxonhill.dnd5eapi.subclass.domain.model.SubclassSpell

data class SubclassView(
    @get:JsonProperty("class")
    val characterClass: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val spells: List<SubclassSpell>? = null,
    val subclassFlavor: String,
    val subclassLevels: String,
    val url: String,
)

fun Subclass.toView() = SubclassView(
    characterClass = characterClass,
    desc = desc,
    index = index,
    name = name,
    spells = spells,
    subclassFlavor = subclassFlavor,
    subclassLevels = subclassLevels,
    url = url,
)
