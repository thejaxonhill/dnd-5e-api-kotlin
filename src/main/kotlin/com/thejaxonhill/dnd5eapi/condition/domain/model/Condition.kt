package com.thejaxonhill.dnd5eapi.condition.domain.model

import java.time.LocalDateTime

data class Condition(
    val id: String? = null,
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
    val updatedAt: LocalDateTime
)

data class ConditionExample(val name: String? = null)
