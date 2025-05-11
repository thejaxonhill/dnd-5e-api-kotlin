package com.thejaxonhill.dnd5eapi.magicschool.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface MagicSchoolRepository : IndexedMongoRepository<MagicSchoolDocument, String>