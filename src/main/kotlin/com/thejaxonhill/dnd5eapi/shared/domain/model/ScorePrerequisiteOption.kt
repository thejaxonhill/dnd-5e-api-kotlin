package com.thejaxonhill.dnd5eapi.shared.domain.model

data class ScorePrerequisiteOption(
    val abilityScore: com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference,
    val minimumScore: Int
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Option("score_prerequisite")