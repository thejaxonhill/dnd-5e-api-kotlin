package com.thejaxonhill.dnd5eapi.monster.domain.model

data class Sense(
    val blindsight: String? = null,
    val darkvision: String? = null,
    val passivePerception: Int,
    val tremorsense: String? = null,
    val truesight: String? = null,
)
