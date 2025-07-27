package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class MultiClassing(
    val prerequisites: List<MultiClassingPrerequisite>? = null,
    val prerequisiteOptions: Choice? = null,
    val proficiencies: List<ApiReference>? = null,
    val proficiencyChoices: List<Choice>? = null,
)
