package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.abilityscore.domain.model.AbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.domain.repository.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class AbilityScoreMongoAdapter(repository: AbilityScoreMongoRepository) :
    MongoAdapter<AbilityScore, AbilityScoreDocument>(repository),
    AbilityScoreRepository {
    override fun AbilityScoreDocument.toDomain() = AbilityScore(
        desc = desc,
        fullName = fullName,
        index = index,
        name = name,
        skills = skills,
        url = url,
        updatedAt = updatedAt,
    )

    override fun AbilityScore.toEntity() = AbilityScoreDocument(
        desc = desc,
        fullName = fullName,
        index = index,
        name = name,
        skills = skills,
        url = url,
        updatedAt = updatedAt,
    )
}