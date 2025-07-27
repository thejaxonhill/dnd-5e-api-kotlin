package com.thejaxonhill.dnd5eapi.shared.domain.model

data class FeaturePrerequisite(
    val feature: String
) : Prerequisite("feature")
