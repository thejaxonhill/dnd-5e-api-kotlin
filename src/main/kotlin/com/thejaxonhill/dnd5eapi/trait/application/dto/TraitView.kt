package com.thejaxonhill.dnd5eapi.trait.application.dto

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.trait.domain.model.Trait
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitProficiency
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitSpecific

data class TraitView(
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
)

fun Trait.toView() = TraitView(
    desc = desc,
    index = index,
    name = name,
    proficiencies = proficiencies,
    proficiencyChoices = proficiencyChoices,
    languageOptions = languageOptions,
    races = races,
    subraces = subraces,
    parent = parent,
    traitSpecific = traitSpecific,
    url = url,
)
