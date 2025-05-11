package com.thejaxonhill.dnd5eapi.magicitem.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface MagicItemRepository : IndexedMongoRepository<MagicItemDocument, String>