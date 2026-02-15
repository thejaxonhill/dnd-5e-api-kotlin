package com.thejaxonhill.dnd5eapi.trait.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
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

data class TraitExample(val name: String? = null)
