package com.thejaxonhill.dnd5eapi.damagetype.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.damagetype.domain.model.DamageType
import com.thejaxonhill.dnd5eapi.damagetype.domain.repository.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class DamageTypeMongoAdapter(repository: DamageTypeMongoRepository) :
    MongoAdapter<DamageType, DamageTypeDocument>(repository),
    DamageTypeRepository {
    override fun DamageTypeDocument.toDomain() = DamageType(
        index = index,
        name = name,
        desc = desc,
        url = url,
        updatedAt = updatedAt,
    )
}