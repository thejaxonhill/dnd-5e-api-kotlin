package com.thejaxonhill.dnd5eapi.trait.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class TraitSpecific(
    val subtraitOptions: Choice? = null,
    val spellOptions: Choice? = null,
    val damageType: ApiReference? = null,
    val breathWeapon: TraitSpecificAction? = null,
)
