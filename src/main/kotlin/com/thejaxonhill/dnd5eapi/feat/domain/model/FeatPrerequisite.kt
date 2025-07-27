package com.thejaxonhill.dnd5eapi.feat.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class FeatPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)
