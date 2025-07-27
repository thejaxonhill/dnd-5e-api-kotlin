package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.proficiency.domain.model.Proficiency
import com.thejaxonhill.dnd5eapi.proficiency.domain.repository.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class ProficiencyMongoAdapter(repository: ProficiencyMongoRepository) :
    MongoAdapter<Proficiency, ProficiencyDocument>(repository),
    ProficiencyRepository {
    override fun ProficiencyDocument.toDomain() = Proficiency(
        classes = classes,
        index = index,
        name = name,
        races = races,
        reference = reference,
        type = type,
        url = url,
        updatedAt = updatedAt,
    )

}