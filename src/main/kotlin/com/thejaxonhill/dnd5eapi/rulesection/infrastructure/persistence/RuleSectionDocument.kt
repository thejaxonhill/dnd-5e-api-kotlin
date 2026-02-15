package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "rule-sections")
class RuleSectionDocument(
    @Id
    var id: String? = null,
    var desc: String? = null,
    var index: String? = null,
    var name: String? = null,
    var url: String? = null,
    var updatedAt: String? = null
)