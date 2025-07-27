package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feature.domain.model.Feature
import com.thejaxonhill.dnd5eapi.feature.domain.repository.FeatureRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class FeatureMongoAdapter(repository: FeatureMongoRepository) :
    MongoAdapter<Feature, FeatureDocument>(repository),
    FeatureRepository {
    override fun FeatureDocument.toDomain() = Feature(
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
}