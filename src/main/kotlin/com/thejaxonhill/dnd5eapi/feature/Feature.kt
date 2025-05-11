package com.thejaxonhill.dnd5eapi.feature

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Prerequisite
import java.util.*

data class Feature(
    val characterClass: ApiReference,
    val desc: List<String>,
    val parent: ApiReference? = null,
    val index: String,
    val level: Int,
    val name: String,
    val prerequisite: List<Prerequisite>?,
    val reference: String?,
    val subclass: ApiReference?,
    val featureSpecific: FeatureSpecific?,
    val url: String,
    val updatedAt: Date
)
