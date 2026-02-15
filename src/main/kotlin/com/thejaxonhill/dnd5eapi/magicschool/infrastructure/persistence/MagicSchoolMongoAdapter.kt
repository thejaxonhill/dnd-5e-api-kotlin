package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.magicschool.domain.model.MagicSchool
import com.thejaxonhill.dnd5eapi.magicschool.domain.repository.MagicSchoolRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MagicSchoolMongoAdapter(repository: MagicSchoolMongoRepository) :
    MongoAdapter<MagicSchool, MagicSchoolDocument>(repository),
    MagicSchoolRepository {
    override fun MagicSchoolDocument.toDomain() = MagicSchool(
        desc = desc,
        index = index,
        name = name,
        url = url,
        updatedAt = updatedAt,
    )
}