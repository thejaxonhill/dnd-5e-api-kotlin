package com.thejaxonhill.dnd5eapi.monster

data class Sense(
    val blindsight: String? = null,
    val darkvision: String? = null,
    val passivePerception: Int,
    val tremorsense: String? = null,
    val truesight: String? = null,
)
