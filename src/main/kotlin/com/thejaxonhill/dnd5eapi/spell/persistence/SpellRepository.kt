package com.thejaxonhill.dnd5eapi.spell.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface SpellRepository : IndexedMongoRepository<SpellDocument, String>