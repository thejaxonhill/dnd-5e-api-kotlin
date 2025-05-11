package com.thejaxonhill.dnd5eapi.characterclass

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class CharacterClassSpellcasting(
    val info: List<SpellcastingInfo>,
    val level: Int,
    val spellcastingAbility: ApiReference
)
