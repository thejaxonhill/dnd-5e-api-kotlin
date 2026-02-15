package com.thejaxonhill.dnd5eapi.damagetype.application.dto

import com.thejaxonhill.dnd5eapi.damagetype.domain.model.DamageType

data class DamageTypeView(
    val index: String,
    val name: String,
    val desc: List<String>,
    val url: String,
)

fun DamageType.toView() = DamageTypeView(
    index = index,
    name = name,
    desc = desc,
    url = url,
)
