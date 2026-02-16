package com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.EquipmentCategory
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.EquipmentCategoryExample
import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.EquipmentCategoryRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoEquipmentCategoryRepository(private val repository: EquipmentCategoryMongoRepository) : EquipmentCategoryRepository {
    override fun load(id: String): EquipmentCategory? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): EquipmentCategory? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: EquipmentCategoryExample?): PagedModel<EquipmentCategory> =
        repository.findAll(
            Example.of(example?.toEquipmentCategoryDocument() ?: EquipmentCategoryDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(equipmentCategory: EquipmentCategory) = repository.save(equipmentCategory.toDocument()).toDomain()
}

fun EquipmentCategoryDocument.toDomain() = EquipmentCategory(
    id = id,
    equipment = equipment!!,
    index = index!!,
    name = name!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun EquipmentCategory.toDocument() = EquipmentCategoryDocument(
    id = id,
    equipment = equipment,
    index = index,
    name = name,
    url = url,
    updatedAt = updatedAt,
)

fun EquipmentCategoryExample.toEquipmentCategoryDocument(): EquipmentCategoryDocument = EquipmentCategoryDocument(
    name = name
)
