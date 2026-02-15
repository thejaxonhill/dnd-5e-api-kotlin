package com.thejaxonhill.dnd5eapi.condition.application.dto

import com.thejaxonhill.dnd5eapi.condition.domain.model.Condition

data class ConditionView(
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
)

fun Condition.toView() = ConditionView(
    index = index,
    name = name,
    desc = desc,
    url = url,
)
