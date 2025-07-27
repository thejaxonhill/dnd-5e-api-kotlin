package com.thejaxonhill.dnd5eapi.feat.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface FeatMongoRepository : IndexedMongoRepository<FeatDocument, String>