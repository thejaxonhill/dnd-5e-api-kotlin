package com.thejaxonhill.dnd5eapi.alignment.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface AlignmentRepository : IndexedMongoRepository<AlignmentDocument, String>