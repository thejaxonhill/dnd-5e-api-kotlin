package com.thejaxonhill.dnd5eapi.shared.model

data class ScorePrerequisiteOption(
    val abilityScore: ApiReference,
    val minimumScore: Int
) : Option("score_prerequisite")