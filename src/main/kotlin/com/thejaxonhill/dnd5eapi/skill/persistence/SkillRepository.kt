package com.thejaxonhill.dnd5eapi.skill.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface SkillRepository : IndexedMongoRepository<SkillDocument, String>