package com.thejaxonhill.dnd5eapi.shared.domain.model

data class ChoiceOption(
    val choice: com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Option("choice")
