package com.thejaxonhill.dnd5eapi.rule.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface RuleRepository : IndexedMongoRepository<RuleDocument, String>