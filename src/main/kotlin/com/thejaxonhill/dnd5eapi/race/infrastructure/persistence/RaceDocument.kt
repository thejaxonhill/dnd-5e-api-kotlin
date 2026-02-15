package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.race.domain.model.RaceAbilityBonus
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "races")
data class RaceDocument(
    @Id
    val id: String? = null,
    val abilityBonusOptions: Choice? = null,
    val abilityBonuses: List<RaceAbilityBonus>? = null,
    val age: String? = null,
    val alignment: String? = null,
    val index: String? = null,
    val languageDesc: String? = null,
    val languageOptions: Choice? = null,
    val languages: List<ApiReference>? = null,
    val name: String? = null,
    val size: String? = null,
    val sizeDescription: String? = null,
    val speed: Long? = null,
    val startingProficiencies: List<ApiReference>? = null,
    val startingProficiencyOptions: Choice? = null,
    val subraces: List<ApiReference>? = null,
    val traits: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)