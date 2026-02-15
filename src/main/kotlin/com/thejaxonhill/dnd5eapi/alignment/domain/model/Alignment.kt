package com.thejaxonhill.dnd5eapi.alignment.domain.model

import java.time.LocalDateTime

class Alignment(
    val id: String? = null,
    val index: String,
    val name: String? = null,
    val abbreviation: String? = null,
    val desc: String? = null,
    val url: String? = null,
    val updatedAt: LocalDateTime? = null
)

data class AlignmentExample(val name: String, val abbreviation: String)
