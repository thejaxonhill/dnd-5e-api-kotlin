package com.thejaxonhill.dnd5eapi.characterclass.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface CharacterClassRepository : IndexedMongoRepository<CharacterClassDocument, String>