package com.thejaxonhill.dnd5eapi.level.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface LevelRepository : IndexedMongoRepository<LevelDocument, String>