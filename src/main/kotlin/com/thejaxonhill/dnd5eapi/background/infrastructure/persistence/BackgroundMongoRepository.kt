package com.thejaxonhill.dnd5eapi.background.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface BackgroundMongoRepository : IndexedMongoRepository<BackgroundDocument, String>