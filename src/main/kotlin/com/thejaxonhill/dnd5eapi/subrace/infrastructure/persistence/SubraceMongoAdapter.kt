package com.thejaxonhill.dnd5eapi.subrace.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.subrace.domain.model.Subrace
import com.thejaxonhill.dnd5eapi.subrace.domain.repository.SubraceRepository
import org.springframework.stereotype.Component

@Component
class SubraceMongoAdapter(repository: SubraceMongoRepository) :
    MongoAdapter<Subrace, SubraceDocument>(repository),
    SubraceRepository {
    override fun SubraceDocument.toDomain() = Subrace(
        abilityBonuses = abilityBonuses,
        desc = desc,
        index = index,
        languages = languages,
        languageOptions = languageOptions,
        name = name,
        race = race,
        racialTraits = racialTraits,
        startingProficiencies = startingProficiencies,
        url = url,
        updatedAt = updatedAt,
    )
}