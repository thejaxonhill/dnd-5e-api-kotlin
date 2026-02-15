package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "magic-schools")
class MagicSchoolDocument(
    @Id
    var id: String? = null,
    var desc: String? = null,
    var index: String? = null,
    var name: String? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)