package com.thejaxonhill.dnd5eapi.trait

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice

data class TraitSpecific(
    val subtraitOptions: Choice? = null,
    val spellOptions: Choice? = null,
    val damageType: ApiReference? = null,
    val breathWeapon: TraitSpecificAction? = null,
)
