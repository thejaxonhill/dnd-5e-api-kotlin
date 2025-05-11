package com.thejaxonhill.dnd5eapi.abilityscore.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface AbilityScoreRepository : IndexedMongoRepository<AbilityScoreDocument, String>