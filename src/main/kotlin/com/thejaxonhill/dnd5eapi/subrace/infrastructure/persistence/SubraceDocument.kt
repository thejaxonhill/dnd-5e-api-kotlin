package com.thejaxonhill.dnd5eapi.subrace.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.subrace.domain.model.SubraceAbilityBonus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "subraces")
data class SubraceDocument(
    @Id
    val id: String? = null,
    val abilityBonuses: List<SubraceAbilityBonus>? = null,
    val desc: String? = null,
    val index: String? = null,
    val languages: List<ApiReference>? = null,
    val languageOptions: Choice? = null,
    val name: String? = null,
    val race: ApiReference? = null,
    val racialTraits: List<ApiReference>? = null,
    val startingProficiencies: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)