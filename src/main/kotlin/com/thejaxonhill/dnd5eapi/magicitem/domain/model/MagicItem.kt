package com.thejaxonhill.dnd5eapi.magicitem.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.util.*

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
    val updatedAt: Date,
)

data class MagicItemExample(val name: String? = null)
