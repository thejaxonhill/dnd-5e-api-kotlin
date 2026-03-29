package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "2014-2014-proficiencies")
class ProficiencyDocument(
    @Id
    var id: String? = null,
    var classes: List<ApiReference>? = null,
    var index: String? = null,
    var name: String? = null,
    var races: List<ApiReference>? = null,
    var reference: ApiReference? = null,
    var type: String? = null,
    var url: String? = null,
    var updatedAt: String? = null
)