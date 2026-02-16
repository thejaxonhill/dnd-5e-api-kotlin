package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicitem.domain.MagicItem
import com.thejaxonhill.dnd5eapi.magicitem.domain.MagicItemExample
import com.thejaxonhill.dnd5eapi.magicitem.domain.MagicItemRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoMagicItemRepository(private val repository: MagicItemMongoRepository) : MagicItemRepository {
    override fun load(id: String): MagicItem? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): MagicItem? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: MagicItemExample?): PagedModel<MagicItem> =
        repository.findAll(
            Example.of(example?.toMagicItemDocument() ?: MagicItemDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(magicItem: MagicItem) = repository.save(magicItem.toDocument()).toDomain()
}

fun MagicItemDocument.toDomain() = MagicItem(
    id = id,
    desc = desc!!,
    equipmentCategory = equipmentCategory!!,
    image = image,
    index = index!!,
    name = name!!,
    rarity = rarity!!,
    url = url!!,
    variants = variants!!,
    variant = variant!!,
    updatedAt = updatedAt!!,
)

fun MagicItem.toDocument() = MagicItemDocument(
    id = id,
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

fun MagicItemExample.toMagicItemDocument(): MagicItemDocument = MagicItemDocument(
    name = name
)
