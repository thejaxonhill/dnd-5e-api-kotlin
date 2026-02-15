package com.thejaxonhill.dnd5eapi.damagetype.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.damagetype.domain.model.DamageType
import com.thejaxonhill.dnd5eapi.damagetype.domain.model.DamageTypeExample
import com.thejaxonhill.dnd5eapi.damagetype.domain.repository.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoDamageTypeRepository(private val repository: DamageTypeMongoRepository) : DamageTypeRepository {
    override fun load(id: String): DamageType? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): DamageType? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: DamageTypeExample?): PagedModel<DamageType> =
        repository.findAll(
            Example.of(example?.toDamageTypeDocument() ?: DamageTypeDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(damageType: DamageType) = repository.save(damageType.toDocument()).toDomain()
}

fun DamageTypeDocument.toDomain() = DamageType(
    id = id,
    index = index!!,
    name = name!!,
    desc = desc!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun DamageType.toDocument() = DamageTypeDocument(
    id = id,
    index = index,
    name = name,
    desc = desc,
    url = url,
    updatedAt = updatedAt,
)

fun DamageTypeExample.toDamageTypeDocument(): DamageTypeDocument = DamageTypeDocument(
    name = name
)
