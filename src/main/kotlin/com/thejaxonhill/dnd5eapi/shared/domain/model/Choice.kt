package com.thejaxonhill.dnd5eapi.shared.domain.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Choice(
    val desc: String? = null,
    val choose: Int,
    val type: String,
    val from: OptionSet
)
