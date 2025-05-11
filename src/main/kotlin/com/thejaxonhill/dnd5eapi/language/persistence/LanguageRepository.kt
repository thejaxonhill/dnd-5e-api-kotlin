package com.thejaxonhill.dnd5eapi.language.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface LanguageRepository : IndexedMongoRepository<LanguageDocument, String>