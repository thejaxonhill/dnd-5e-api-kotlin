package com.thejaxonhill.dnd5eapi.magicitem.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class MagicItem(
    val id: String? = null,
    val desc: List<String>,
    val equipmentCategory: ApiReference,
    val image: String? = null,
    val index: String,
    val name: String,
    val rarity: Rarity,
    val url: String,
    val variants: List<ApiReference>,
    val variant: Boolean,
    val updatedAt: LocalDateTime,
)

data class MagicItemExample(val name: String?)
data class Rarity(
    val name: String,
)