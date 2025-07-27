package com.thejaxonhill.dnd5eapi.monster.domain.model

data class ActionUsage(
    val type: String,
    val dice: String? = null,
    val minValue: Long? = null,
)
