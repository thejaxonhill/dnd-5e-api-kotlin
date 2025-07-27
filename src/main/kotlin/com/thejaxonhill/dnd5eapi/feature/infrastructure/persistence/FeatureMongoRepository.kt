package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface FeatureMongoRepository : IndexedMongoRepository<FeatureDocument, String>