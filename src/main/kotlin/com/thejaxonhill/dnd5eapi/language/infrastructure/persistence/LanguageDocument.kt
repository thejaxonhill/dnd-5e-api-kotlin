package com.thejaxonhill.dnd5eapi.language.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "languages")
class LanguageDocument(
    @Id
    var id: String? = null,
    var desc: String? = null,
    var index: String? = null,
    var name: String? = null,
    var script: String? = null,
    var type: String? = null,
    var typicalSpeakers: List<String>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)