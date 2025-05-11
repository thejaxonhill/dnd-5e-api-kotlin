package com.thejaxonhill.dnd5eapi.monster.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface MonsterRepository : IndexedMongoRepository<MonsterDocument, String>