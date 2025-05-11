package com.thejaxonhill.dnd5eapi.proficiency.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface ProficiencyRepository : IndexedMongoRepository<ProficiencyDocument, String>