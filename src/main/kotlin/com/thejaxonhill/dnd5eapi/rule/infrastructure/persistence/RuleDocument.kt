package com.thejaxonhill.dnd5eapi.rule.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "rules")
class RuleDocument(
    @Id
    var id: String? = null,
    var desc: String? = null,
    var index: String? = null,
    var name: String? = null,
    var subsections: List<ApiReference>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)