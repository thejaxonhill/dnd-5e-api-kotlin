package com.thejaxonhill.dnd5eapi.weaponproperty

import java.util.*

data class WeaponProperty(
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)
