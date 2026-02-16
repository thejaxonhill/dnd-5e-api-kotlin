package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicitem.domain.Rarity
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "magic-items")
class MagicItemDocument(
    @Id
    var id: String? = null,
    var desc: List<String>? = null,
    var equipmentCategory: ApiReference? = null,
    var image: String? = null,
    var index: String? = null,
    var name: String? = null,
    var rarity: Rarity? = null,
    var url: String? = null,
    var variants: List<ApiReference>? = null,
    var variant: Boolean? = null,
    var updatedAt: LocalDateTime? = null
)