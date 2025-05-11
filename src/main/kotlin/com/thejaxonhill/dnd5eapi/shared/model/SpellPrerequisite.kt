package com.thejaxonhill.dnd5eapi.shared.model

data class SpellPrerequisite(
    val spell: String
) : Prerequisite("spell")