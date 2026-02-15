package com.thejaxonhill.dnd5eapi.condition.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "conditions")
class ConditionDocument(
    @Id
    var id: String? = null,
    var index: String? = null,
    var name: String? = null,
    var desc: List<String>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)