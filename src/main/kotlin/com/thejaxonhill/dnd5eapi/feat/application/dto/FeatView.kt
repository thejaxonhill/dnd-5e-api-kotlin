package com.thejaxonhill.dnd5eapi.feat.application.dto

import com.thejaxonhill.dnd5eapi.feat.domain.model.Feat
import com.thejaxonhill.dnd5eapi.feat.domain.model.FeatPrerequisite

data class FeatView(
    val index: String,
    val name: String,
    val prerequisites: List<FeatPrerequisite>,
    val desc: List<String>,
    val url: String,
)

fun Feat.toView() = FeatView(
    index = index,
    name = name,
    prerequisites = prerequisites,
    desc = desc,
    url = url,
)
