package com.thejaxonhill.dnd5eapi.characterclass.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class CharacterClassSpellcasting(
    val info: List<SpellcastingInfo>,
    val level: Int,
    val spellcastingAbility: ApiReference
)
