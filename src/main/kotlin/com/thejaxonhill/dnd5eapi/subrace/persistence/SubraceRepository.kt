package com.thejaxonhill.dnd5eapi.subrace.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface SubraceRepository : IndexedMongoRepository<SubraceDocument, String>