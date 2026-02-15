package com.thejaxonhill.dnd5eapi.alignment.infrastructure.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "alignments")
class AlignmentDocument(
    @Id
    var id: String? = null,

    var index: String? = null,

    var name: String? = null,

    var abbreviation: String? = null,

    var desc: String? = null,

    var url: String? = null,

    @Field("updated_at")
    var updatedAt: LocalDateTime? = null,
)