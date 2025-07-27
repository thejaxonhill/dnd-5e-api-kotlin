package com.thejaxonhill.dnd5eapi.alignment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.alignment.domain.model.Alignment
import com.thejaxonhill.dnd5eapi.alignment.domain.repository.AlignmentRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class AlignmentMongoAdapter(repository: AlignmentMongoRepository) :
    MongoAdapter<Alignment, AlignmentDocument>(repository),
    AlignmentRepository {
    override fun AlignmentDocument.toDomain() = Alignment(
        index = index,
        name = name,
        abbreviation = abbreviation,
        desc = desc,
        url = url,
        updatedAt = updatedAt,
    )
}