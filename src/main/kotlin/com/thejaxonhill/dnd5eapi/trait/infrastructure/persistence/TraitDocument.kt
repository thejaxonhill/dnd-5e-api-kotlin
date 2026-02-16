package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.trait.domain.TraitProficiency
import com.thejaxonhill.dnd5eapi.trait.domain.TraitSpecific
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "traits")
class TraitDocument(
    @Id
    var id: String? = null,
    var desc: List<String>? = null,
    var index: String? = null,
    var name: String? = null,
    var proficiencies: List<TraitProficiency>? = null,
    var proficiencyChoices: Choice? = null,
    var languageOptions: Choice? = null,
    var races: List<ApiReference>? = null,
    var subraces: List<ApiReference>? = null,
    var parent: ApiReference? = null,
    var traitSpecific: TraitSpecific? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)