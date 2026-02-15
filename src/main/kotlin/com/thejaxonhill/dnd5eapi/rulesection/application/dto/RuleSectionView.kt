package com.thejaxonhill.dnd5eapi.rulesection.application.dto

import com.thejaxonhill.dnd5eapi.rulesection.domain.model.RuleSection

data class RuleSectionView(
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
)

fun RuleSection.toView() = RuleSectionView(
    desc = desc,
    index = index,
    name = name,
    url = url,
)
