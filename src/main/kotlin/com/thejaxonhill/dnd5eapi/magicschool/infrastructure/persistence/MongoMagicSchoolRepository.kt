package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicschool.domain.MagicSchool
import com.thejaxonhill.dnd5eapi.magicschool.domain.MagicSchoolExample
import com.thejaxonhill.dnd5eapi.magicschool.domain.MagicSchoolRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoMagicSchoolRepository(private val repository: MagicSchoolMongoRepository) : MagicSchoolRepository {
    override fun load(id: String): MagicSchool? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): MagicSchool? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: MagicSchoolExample?): PagedModel<MagicSchool> =
        repository.findAll(
            Example.of(example?.toMagicSchoolDocument() ?: MagicSchoolDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(magicSchool: MagicSchool) = repository.save(magicSchool.toDocument()).toDomain()
}

fun MagicSchoolDocument.toDomain() = MagicSchool(
    id = id,
    desc = desc!!,
    index = index!!,
    name = name!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun MagicSchool.toDocument() = MagicSchoolDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    url = url,
    updatedAt = updatedAt,
)

fun MagicSchoolExample.toMagicSchoolDocument(): MagicSchoolDocument = MagicSchoolDocument(
    name = name
)
