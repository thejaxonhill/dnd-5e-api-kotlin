package com.thejaxonhill.dnd5eapi.feature.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite
import java.time.LocalDateTime

data class Feature(
    val id: String? = null,
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
    val updatedAt: LocalDateTime
)

data class FeatureExample(val name: String?)
