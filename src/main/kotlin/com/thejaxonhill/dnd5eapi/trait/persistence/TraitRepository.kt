package com.thejaxonhill.dnd5eapi.trait.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface TraitRepository : IndexedMongoRepository<TraitDocument, String>