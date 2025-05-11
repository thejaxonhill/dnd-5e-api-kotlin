package com.thejaxonhill.dnd5eapi.shared.model

data class LevelPrerequisite(
    val level: Int
) : Prerequisite("level")
