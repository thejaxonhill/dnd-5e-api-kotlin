package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "ability-scores")
class AbilityScoreDocument(
    @Id
    var id: String? = null,

    var desc: List<String>? = null,

    var fullName: String? = null,

    var index: String? = null,

    var name: String? = null,

    var skills: List<ApiReference>? = null,

    var url: String? = null,
    
    var updatedAt: LocalDateTime? = null
)