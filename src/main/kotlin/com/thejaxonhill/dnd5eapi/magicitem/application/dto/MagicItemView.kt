package com.thejaxonhill.dnd5eapi.magicitem.application.dto

import com.thejaxonhill.dnd5eapi.magicitem.domain.model.MagicItem
import com.thejaxonhill.dnd5eapi.magicitem.domain.model.Rarity
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference

data class MagicItemView(
    val desc: List<String>,
    val equipmentCategory: ApiReference,
    val image: String? = null,
    val index: String,
    val name: String,
    val rarity: Rarity,
    val url: String,
    val variants: List<ApiReference>,
    val variant: Boolean,
)

fun MagicItem.toView() = MagicItemView(
    desc = desc,
    equipmentCategory = equipmentCategory,
    image = image,
    index = index,
    name = name,
    rarity = rarity,
    url = url,
    variants = variants,
    variant = variant,
)
