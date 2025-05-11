package com.thejaxonhill.dnd5eapi.shared.model

data class FeaturePrerequisite(
    val feature: String
) : Prerequisite("feature")
