package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.race.domain.model.Race
import com.thejaxonhill.dnd5eapi.race.domain.repository.RaceRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RaceMongoAdapter(repository: RaceMongoRepository) :
    MongoAdapter<Race, RaceDocument>(repository),
    RaceRepository {
    override fun RaceDocument.toDomain() = Race(
        abilityBonusOptions = abilityBonusOptions,
        abilityBonuses = abilityBonuses,
        age = age,
        alignment = alignment,
        index = index,
        languageDesc = languageDesc,
        languageOptions = languageOptions,
        languages = languages,
        name = name,
        size = size,
        sizeDescription = sizeDescription,
        speed = speed,
        startingProficiencies = startingProficiencies,
        startingProficiencyOptions = startingProficiencyOptions,
        subraces = subraces,
        traits = traits,
        url = url,
        updatedAt = updatedAt,
    )
}