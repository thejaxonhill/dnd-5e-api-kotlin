package com.thejaxonhill.dnd5eapi.feat

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class FeatPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)
