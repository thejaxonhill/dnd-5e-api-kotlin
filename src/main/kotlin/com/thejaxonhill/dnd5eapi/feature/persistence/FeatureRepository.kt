package com.thejaxonhill.dnd5eapi.feature.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface FeatureRepository : IndexedMongoRepository<FeatureDocument, String>