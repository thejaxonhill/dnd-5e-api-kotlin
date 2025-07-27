package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class MultiClassingPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)