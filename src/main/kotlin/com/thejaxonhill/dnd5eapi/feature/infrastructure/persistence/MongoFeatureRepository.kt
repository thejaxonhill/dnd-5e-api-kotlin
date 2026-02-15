package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feature.domain.model.Feature
import com.thejaxonhill.dnd5eapi.feature.domain.model.FeatureExample
import com.thejaxonhill.dnd5eapi.feature.domain.repository.FeatureRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoFeatureRepository(private val repository: FeatureMongoRepository) : FeatureRepository {
    override fun load(id: String): Feature? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Feature? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: FeatureExample?): PagedModel<Feature> =
        repository.findAll(
            Example.of(example?.toFeatureDocument() ?: FeatureDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(feature: Feature) = repository.save(feature.toDocument()).toDomain()
}

fun FeatureDocument.toDomain() = Feature(
    id = id,
    characterClass = characterClass!!,
    desc = desc!!,
    parent = parent,
    index = index!!,
    level = level!!,
    name = name!!,
    prerequisite = prerequisite,
    reference = reference,
    subclass = subclass,
    featureSpecific = featureSpecific,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Feature.toDocument() = FeatureDocument(
    id = id,
    characterClass = characterClass,
    desc = desc,
    parent = parent,
    index = index,
    level = level,
    name = name,
    prerequisite = prerequisite,
    reference = reference,
    subclass = subclass,
    featureSpecific = featureSpecific,
    url = url,
    updatedAt = updatedAt,
)

fun FeatureExample.toFeatureDocument(): FeatureDocument = FeatureDocument(
    name = name
)
