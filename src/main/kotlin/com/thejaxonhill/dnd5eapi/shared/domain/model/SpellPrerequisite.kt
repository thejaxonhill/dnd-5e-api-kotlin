package com.thejaxonhill.dnd5eapi.shared.domain.model

data class SpellPrerequisite(
    val spell: String
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite("spell")