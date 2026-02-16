package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.race.domain.AbilityBonus
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "races")
class RaceDocument(
    @Id
    var id: String? = null,
    var abilityBonusOptions: Choice? = null,
    var abilityBonuses: List<AbilityBonus>? = null,
    var age: String? = null,
    var alignment: String? = null,
    var index: String? = null,
    var languageDesc: String? = null,
    var languageOptions: Choice? = null,
    var languages: List<ApiReference>? = null,
    var name: String? = null,
    var size: String? = null,
    var sizeDescription: String? = null,
    var speed: Long? = null,
    var startingProficiencies: List<ApiReference>? = null,
    var startingProficiencyOptions: Choice? = null,
    var subraces: List<ApiReference>? = null,
    var traits: List<ApiReference>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)