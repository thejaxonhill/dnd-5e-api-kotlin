package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface RaceMongoRepository : IndexedMongoRepository<RaceDocument, String>