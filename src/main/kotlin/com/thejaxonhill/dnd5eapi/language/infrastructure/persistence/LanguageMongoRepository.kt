package com.thejaxonhill.dnd5eapi.language.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface LanguageMongoRepository : IndexedMongoRepository<LanguageDocument, String>