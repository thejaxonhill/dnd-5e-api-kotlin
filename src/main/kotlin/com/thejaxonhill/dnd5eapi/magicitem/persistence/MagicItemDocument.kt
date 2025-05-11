package com.thejaxonhill.dnd5eapi.magicitem.persistence

import com.thejaxonhill.dnd5eapi.magicitem.Rarity
import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "magic-items")
class MagicItemDocument(
    @Id
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