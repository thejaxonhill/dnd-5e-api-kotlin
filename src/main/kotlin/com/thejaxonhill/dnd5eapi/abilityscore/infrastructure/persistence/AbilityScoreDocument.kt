package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "ability-scores")
class AbilityScoreDocument(
    @Id
    var id: String? = null,
    var desc: List<String>,
    var fullName: String,
    var index: String,
    var name: String,
    var skills: List<ApiReference>,
    var url: String,
    var updatedAt: Date
)