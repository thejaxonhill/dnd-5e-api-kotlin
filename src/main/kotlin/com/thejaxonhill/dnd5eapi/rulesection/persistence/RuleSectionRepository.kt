package com.thejaxonhill.dnd5eapi.rulesection.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface RuleSectionRepository : IndexedMongoRepository<RuleSectionDocument, String>