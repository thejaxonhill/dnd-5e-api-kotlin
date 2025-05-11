package com.thejaxonhill.dnd5eapi.background.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface BackgroundRepository : IndexedMongoRepository<BackgroundDocument, String>