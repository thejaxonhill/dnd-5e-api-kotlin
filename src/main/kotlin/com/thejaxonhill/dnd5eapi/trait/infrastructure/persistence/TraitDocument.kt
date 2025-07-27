package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitProficiency
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitSpecific
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "traits")
class TraitDocument(
    @Id
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
    val updatedAt: Date,
)