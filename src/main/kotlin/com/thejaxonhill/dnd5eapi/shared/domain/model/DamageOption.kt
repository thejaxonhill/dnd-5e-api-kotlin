package com.thejaxonhill.dnd5eapi.shared.domain.model

data class DamageOption(
    val damageType: com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference,
    val damageDice: String,
    val notes: String
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Option("damage")
