package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class SpecialAbilitySpellcasting(
    val level: Int? = null,
    val ability: ApiReference,
    val dc: Int? = null,
    val modifier: Int? = null,
    val componentsRequired: List<String>,
    val school: String? = null,
    val slots: Map<String, Int>? = null,
    val spells: List<SpecialAbilitySpell>,
)
