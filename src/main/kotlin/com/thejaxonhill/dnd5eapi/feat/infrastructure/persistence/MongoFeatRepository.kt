package com.thejaxonhill.dnd5eapi.feat.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feat.domain.Feat
import com.thejaxonhill.dnd5eapi.feat.domain.FeatExample
import com.thejaxonhill.dnd5eapi.feat.domain.FeatRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoFeatRepository(private val repository: FeatMongoRepository) : FeatRepository {
    override fun load(id: String): Feat? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Feat? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: FeatExample?): PagedModel<Feat> =
        repository.findAll(
            Example.of(example?.toFeatDocument() ?: FeatDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(feat: Feat) = repository.save(feat.toDocument()).toDomain()
}

fun FeatDocument.toDomain() = Feat(
    id = id,
    index = index!!,
    name = name!!,
    prerequisites = prerequisites!!,
    desc = desc!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Feat.toDocument() = FeatDocument(
    id = id,
    index = index,
    name = name,
    prerequisites = prerequisites,
    desc = desc,
    url = url,
    updatedAt = updatedAt,
)

fun FeatExample.toFeatDocument(): FeatDocument = FeatDocument(
    name = name
)
