package com.thejaxonhill.dnd5eapi.alignment.application.dto

import com.thejaxonhill.dnd5eapi.alignment.domain.model.Alignment

data class AlignmentView(
    val index: String,
    val name: String? = null,
    val abbreviation: String? = null,
    val desc: String? = null,
    val url: String? = null,
)

fun Alignment.toView() = AlignmentView(
    index = index,
    name = name,
    abbreviation = abbreviation,
    desc = desc,
    url = url,
)
