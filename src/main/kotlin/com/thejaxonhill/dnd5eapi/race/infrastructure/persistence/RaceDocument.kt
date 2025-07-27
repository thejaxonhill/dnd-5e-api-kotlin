package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.race.domain.model.RaceAbilityBonus
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "races")
class RaceDocument(
    @Id
    var id: String? = null,
    val abilityBonusOptions: Choice? = null,
    val abilityBonuses: List<RaceAbilityBonus>,
    val age: String,
    val alignment: String,
    val index: String,
    val languageDesc: String,
    val languageOptions: Choice? = null,
    val languages: List<ApiReference>,
    val name: String,
    val size: String,
    val sizeDescription: String,
    val speed: Long,
    val startingProficiencies: List<ApiReference>? = null,
    val startingProficiencyOptions: Choice? = null,
    val subraces: List<ApiReference>? = null,
    val traits: List<ApiReference>? = null,
    val url: String,
    val updatedAt: Date,
)