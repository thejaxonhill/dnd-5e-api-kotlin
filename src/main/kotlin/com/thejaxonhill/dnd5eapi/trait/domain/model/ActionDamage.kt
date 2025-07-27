package com.thejaxonhill.dnd5eapi.trait.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class ActionDamage(
    val damageType: ApiReference,
    val damageAtCharacterLevel: Map<String, String>,
)
