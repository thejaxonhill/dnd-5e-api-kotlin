package com.thejaxonhill.dnd5eapi.skill.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.skill.domain.model.Skill
import com.thejaxonhill.dnd5eapi.skill.domain.repository.SkillRepository
import org.springframework.stereotype.Component

@Component
class SkillMongoAdapter(repository: SkillMongoRepository) :
    MongoAdapter<Skill, SkillDocument>(repository),
    SkillRepository {
    override fun SkillDocument.toDomain() = Skill(
        abilityScore = abilityScore,
        desc = desc,
        index = index,
        name = name,
        url = url,
        updatedAt = updatedAt,
    )
}