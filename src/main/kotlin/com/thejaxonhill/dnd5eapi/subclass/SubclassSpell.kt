package com.thejaxonhill.dnd5eapi.subclass

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class SubclassSpell(
    val prerequisites: List<SubclassSpellPrerequisite>,
    val spell: ApiReference,
)
