package com.thejaxonhill.dnd5eapi.rule.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface RuleMongoRepository : IndexedMongoRepository<RuleDocument, String>