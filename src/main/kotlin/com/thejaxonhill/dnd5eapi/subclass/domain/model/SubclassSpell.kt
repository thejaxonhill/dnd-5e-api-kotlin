package com.thejaxonhill.dnd5eapi.subclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class SubclassSpell(
    val prerequisites: List<SubclassSpellPrerequisite>,
    val spell: ApiReference,
)
