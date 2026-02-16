package com.thejaxonhill.dnd5eapi.condition.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.condition.domain.Condition
import com.thejaxonhill.dnd5eapi.condition.domain.ConditionExample
import com.thejaxonhill.dnd5eapi.condition.domain.ConditionRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoConditionRepository(private val repository: ConditionMongoRepository) : ConditionRepository {
    override fun load(id: String): Condition? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Condition? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: ConditionExample?): PagedModel<Condition> =
        repository.findAll(
            Example.of(example?.toConditionDocument() ?: ConditionDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(condition: Condition) = repository.save(condition.toDocument()).toDomain()
}

fun ConditionDocument.toDomain() = Condition(
    id = id,
    index = index!!,
    name = name!!,
    desc = desc!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Condition.toDocument() = ConditionDocument(
    id = id,
    index = index,
    name = name,
    desc = desc,
    url = url,
    updatedAt = updatedAt,
)

fun ConditionExample.toConditionDocument(): ConditionDocument = ConditionDocument(
    name = name
)
