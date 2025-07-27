package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicitem.domain.model.MagicItem
import com.thejaxonhill.dnd5eapi.magicitem.domain.repository.MagicItemRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MagicItemMongoAdapter(repository: MagicItemMongoRepository) :
    MongoAdapter<MagicItem, MagicItemDocument>(repository),
    MagicItemRepository {
    override fun MagicItemDocument.toDomain() = MagicItem(
        desc = desc,
        equipmentCategory = equipmentCategory,
        image = image,
        index = index,
        name = name,
        rarity = rarity,
        url = url,
        variants = variants,
        variant = variant,
        updatedAt = updatedAt,
    )
}