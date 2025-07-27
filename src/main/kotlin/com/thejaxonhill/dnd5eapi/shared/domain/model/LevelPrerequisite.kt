package com.thejaxonhill.dnd5eapi.shared.domain.model

data class LevelPrerequisite(
    val level: Int
) : Prerequisite("level")
