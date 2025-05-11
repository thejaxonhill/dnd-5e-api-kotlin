package com.thejaxonhill.dnd5eapi.trait

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference

data class ActionDamage(
    val damageType: ApiReference,
    val damageAtCharacterLevel: Map<String, String>,
)
