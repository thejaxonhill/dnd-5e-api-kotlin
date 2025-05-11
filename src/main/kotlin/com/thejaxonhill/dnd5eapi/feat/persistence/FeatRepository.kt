package com.thejaxonhill.dnd5eapi.feat.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface FeatRepository : IndexedMongoRepository<FeatDocument, String>