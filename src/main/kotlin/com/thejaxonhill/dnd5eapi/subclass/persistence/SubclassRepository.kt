package com.thejaxonhill.dnd5eapi.subclass.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface SubclassRepository : IndexedMongoRepository<SubclassDocument, String>