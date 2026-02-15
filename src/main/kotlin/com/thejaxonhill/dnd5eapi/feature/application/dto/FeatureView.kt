package com.thejaxonhill.dnd5eapi.feature.application.dto

import com.thejaxonhill.dnd5eapi.feature.domain.model.Feature
import com.thejaxonhill.dnd5eapi.feature.domain.model.FeatureSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite

data class FeatureView(
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
)

fun Feature.toView() = FeatureView(
    characterClass = characterClass,
    desc = desc,
    parent = parent,
    index = index,
    level = level,
    name = name,
    prerequisite = prerequisite,
    reference = reference,
    subclass = subclass,
    featureSpecific = featureSpecific,
    url = url,
)
