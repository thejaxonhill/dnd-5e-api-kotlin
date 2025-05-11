package com.thejaxonhill.dnd5eapi.subrace.persistence

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice
import com.thejaxonhill.dnd5eapi.subrace.SubraceAbilityBonus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "subraces")
class SubraceDocument(
    @Id
    val id: String? = null,
    val abilityBonuses: List<SubraceAbilityBonus>,
    val desc: String,
    val index: String,
    val languages: List<ApiReference>? = null,
    val languageOptions: Choice? = null,
    val name: String,
    val race: ApiReference,
    val racialTraits: List<ApiReference>,
    val startingProficiencies: List<ApiReference>? = null,
    val url: String,
    val updatedAt: Date,
)