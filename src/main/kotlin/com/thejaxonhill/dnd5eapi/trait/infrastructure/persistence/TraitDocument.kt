package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitProficiency
import com.thejaxonhill.dnd5eapi.trait.domain.model.TraitSpecific
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "traits")
data class TraitDocument(
    @Id
    val id: String? = null,
    val desc: List<String>? = null,
    val index: String? = null,
    val name: String? = null,
    val proficiencies: List<TraitProficiency>? = null,
    val proficiencyChoices: Choice? = null,
    val languageOptions: Choice? = null,
    val races: List<ApiReference>? = null,
    val subraces: List<ApiReference>? = null,
    val parent: ApiReference? = null,
    val traitSpecific: TraitSpecific? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)