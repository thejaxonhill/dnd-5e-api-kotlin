package com.thejaxonhill.dnd5eapi.feature.persistence

import com.thejaxonhill.dnd5eapi.feature.Feature
import com.thejaxonhill.dnd5eapi.feature.port.LoadFeaturePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class FeatureMongoAdapter(repository: FeatureRepository) :
    MongoAdapter<Feature>(repository, Feature::class),
    LoadFeaturePort