package com.thejaxonhill.dnd5eapi.feat.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feat.domain.model.Feat
import com.thejaxonhill.dnd5eapi.feat.domain.repository.FeatRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class FeatMongoAdapter(repository: FeatMongoRepository) :
    MongoAdapter<Feat, FeatDocument>(repository),
    FeatRepository {
    override fun FeatDocument.toDomain() = Feat(
         index = index,
         name = name,
         prerequisites = prerequisites,
         desc = desc,
         url = url,
         updatedAt = updatedAt,
    )
}