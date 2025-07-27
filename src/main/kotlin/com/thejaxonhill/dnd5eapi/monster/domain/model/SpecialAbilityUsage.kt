package com.thejaxonhill.dnd5eapi.monster.domain.model

data class SpecialAbilityUsage(
    val type: String,
    val times: Int? = null,
    val restTypes: List<String>? = null,
)
