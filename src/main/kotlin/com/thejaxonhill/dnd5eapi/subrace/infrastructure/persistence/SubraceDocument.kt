package com.thejaxonhill.dnd5eapi.subrace.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.subrace.domain.model.SubraceAbilityBonus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "subraces")
class SubraceDocument(
    @Id
    var id: String? = null,
    var abilityBonuses: List<SubraceAbilityBonus>? = null,
    var desc: String? = null,
    var index: String? = null,
    var languages: List<ApiReference>? = null,
    var languageOptions: Choice? = null,
    var name: String? = null,
    var race: ApiReference? = null,
    var racialTraits: List<ApiReference>? = null,
    var startingProficiencies: List<ApiReference>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)