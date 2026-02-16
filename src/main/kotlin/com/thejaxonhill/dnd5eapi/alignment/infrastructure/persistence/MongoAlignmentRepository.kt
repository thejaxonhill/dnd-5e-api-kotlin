package com.thejaxonhill.dnd5eapi.alignment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.alignment.domain.Alignment
import com.thejaxonhill.dnd5eapi.alignment.domain.AlignmentExample
import com.thejaxonhill.dnd5eapi.alignment.domain.AlignmentRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoAlignmentRepository(private val repository: AlignmentMongoRepository) : AlignmentRepository {
    override fun load(id: String): Alignment? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Alignment? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: AlignmentExample?): PagedModel<Alignment> =
        repository.findAll(
            Example.of(example?.toAlignmentDocument() ?: AlignmentDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(alignment: Alignment) = repository.save(alignment.toDocument()).toDomain()
}

fun AlignmentDocument.toDomain() = Alignment(
    id = id,
    index = index!!,
    name = name,
    abbreviation = abbreviation,
    desc = desc,
    url = url,
    updatedAt = updatedAt,
)

fun Alignment.toDocument() = AlignmentDocument(
    id = id,
    index = index,
    name = name,
    abbreviation = abbreviation,
    desc = desc,
    url = url,
    updatedAt = updatedAt,
)

fun AlignmentExample.toAlignmentDocument(): AlignmentDocument = AlignmentDocument(
    name = name,
    abbreviation = abbreviation
)