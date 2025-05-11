package com.thejaxonhill.dnd5eapi.condition.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface ConditionRepository : IndexedMongoRepository<ConditionDocument, String>