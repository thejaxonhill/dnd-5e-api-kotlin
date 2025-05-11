package com.thejaxonhill.dnd5eapi.damagetype.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface DamageTypeRepository : IndexedMongoRepository<DamageTypeDocument, String>