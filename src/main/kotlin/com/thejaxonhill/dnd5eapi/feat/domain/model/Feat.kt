package com.thejaxonhill.dnd5eapi.feat.domain.model

import java.util.*

data class Feat(
    val index: String,
    val name: String,
    val prerequisites: List<FeatPrerequisite>,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)
