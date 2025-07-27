package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface TraitMongoRepository : IndexedMongoRepository<TraitDocument, String>