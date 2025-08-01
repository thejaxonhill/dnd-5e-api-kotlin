package com.thejaxonhill.dnd5eapi.rule.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.util.*

data class Rule(
    val desc: String,
    val index: String,
    val name: String,
    val subsections: List<ApiReference>,
    val url: String,
    val updatedAt: Date,
)
