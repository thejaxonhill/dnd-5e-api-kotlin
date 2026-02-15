package com.thejaxonhill.dnd5eapi.rulesection.domain.model

data class RuleSection(
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: String,
)

data class RuleSectionExample(val name: String? = null)
