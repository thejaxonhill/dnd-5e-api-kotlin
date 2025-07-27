package com.thejaxonhill.dnd5eapi.condition.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.condition.domain.model.Condition
import com.thejaxonhill.dnd5eapi.condition.domain.repository.ConditionRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class ConditionMongoAdapter(repository: ConditionMongoRepository) :
    MongoAdapter<Condition, ConditionDocument>(repository),
    ConditionRepository {
    override fun ConditionDocument.toDomain() = Condition(
        index = index,
        name = name,
        desc = desc,
        url = url,
        updatedAt = updatedAt,
    )
}