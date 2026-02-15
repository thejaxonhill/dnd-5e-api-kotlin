package com.thejaxonhill.dnd5eapi.magicschool.application.dto

import com.thejaxonhill.dnd5eapi.magicschool.domain.model.MagicSchool

data class MagicSchoolView(
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
)

fun MagicSchool.toView() = MagicSchoolView(
    desc = desc,
    index = index,
    name = name,
    url = url,
)
