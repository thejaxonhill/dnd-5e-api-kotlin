package com.thejaxonhill.dnd5eapi.monster

data class SpecialAbilitySpell(
    val name: String,
    val level: Int,
    val url: String,
    val notes: String?,
    val usage: SpecialAbilityUsage?,
)
