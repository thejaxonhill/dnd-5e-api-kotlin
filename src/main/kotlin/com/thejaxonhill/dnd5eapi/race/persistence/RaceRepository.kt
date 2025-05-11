package com.thejaxonhill.dnd5eapi.race.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface RaceRepository : IndexedMongoRepository<RaceDocument, String>