package com.thejaxonhill.dnd5eapi.characterclass

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class MultiClassingPrerequisite(
    val abilityScore: ApiReference,
    val minimumScore: Int,
)