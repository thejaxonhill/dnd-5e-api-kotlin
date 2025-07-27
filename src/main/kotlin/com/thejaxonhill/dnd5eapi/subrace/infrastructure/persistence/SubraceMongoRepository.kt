package com.thejaxonhill.dnd5eapi.subrace.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface SubraceMongoRepository : IndexedMongoRepository<SubraceDocument, String>