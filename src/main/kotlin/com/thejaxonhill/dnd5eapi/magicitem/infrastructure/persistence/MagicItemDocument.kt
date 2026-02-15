package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicitem.domain.model.Rarity
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "magic-items")
data class MagicItemDocument(
    @Id
    val id: String? = null,
    val desc: List<String>? = null,
    val equipmentCategory: ApiReference? = null,
    val image: String? = null,
    val index: String? = null,
    val name: String? = null,
    val rarity: Rarity? = null,
    val url: String? = null,
    val variants: List<ApiReference>? = null,
    val variant: Boolean? = null,
    val updatedAt: Date? = null
)