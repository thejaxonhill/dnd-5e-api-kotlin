package com.thejaxonhill.dnd5eapi.level.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface LevelMongoRepository : IndexedMongoRepository<LevelDocument, String>