package com.thejaxonhill.dnd5eapi.rule.application.dto

import com.thejaxonhill.dnd5eapi.rule.domain.Rule
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class RuleView(
    val desc: String,
    val index: String,
    val name: String,
    val subsections: List<ApiReference>,
    val url: String,
)

fun Rule.toView() = RuleView(
    desc = desc,
    index = index,
    name = name,
    subsections = subsections,
    url = url,
)
