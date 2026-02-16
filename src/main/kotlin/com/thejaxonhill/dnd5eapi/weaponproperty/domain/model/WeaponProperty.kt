package com.thejaxonhill.dnd5eapi.weaponproperty.domain.model

import java.time.LocalDateTime

data class WeaponProperty(
    val id: String? = null,
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class WeaponPropertyExample(val name: String?)
