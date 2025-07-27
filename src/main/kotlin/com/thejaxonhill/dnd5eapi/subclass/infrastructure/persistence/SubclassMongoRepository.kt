package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface SubclassMongoRepository : IndexedMongoRepository<SubclassDocument, String>