package com.thejaxonhill.dnd5eapi.skill.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository

interface SkillMongoRepository : IndexedMongoRepository<SkillDocument, String>