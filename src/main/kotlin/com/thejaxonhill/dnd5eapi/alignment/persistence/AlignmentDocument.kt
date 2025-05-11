package com.thejaxonhill.dnd5eapi.alignment.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "alignments")
class AlignmentDocument(
    @Id
    val id: String? = null,
    val index: String,
    val name: String,
    val abbreviation: String,
    val desc: String,
    val url: String,
    val updatedAt: Date
)