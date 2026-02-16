package com.thejaxonhill.dnd5eapi.race.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.race.domain.Race
import com.thejaxonhill.dnd5eapi.race.domain.RaceExample
import com.thejaxonhill.dnd5eapi.race.domain.RaceRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoRaceRepository(private val repository: RaceMongoRepository) : RaceRepository {
    override fun load(id: String): Race? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Race? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: RaceExample?): PagedModel<Race> =
        repository.findAll(
            Example.of(example?.toRaceDocument() ?: RaceDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(race: Race) = repository.save(race.toDocument()).toDomain()
}

fun RaceDocument.toDomain() = Race(
    id = id,
    abilityBonusOptions = abilityBonusOptions,
    abilityBonuses = abilityBonuses!!,
    age = age!!,
    alignment = alignment!!,
    index = index!!,
    languageDesc = languageDesc!!,
    languageOptions = languageOptions,
    languages = languages!!,
    name = name!!,
    size = size!!,
    sizeDescription = sizeDescription!!,
    speed = speed!!,
    startingProficiencies = startingProficiencies,
    startingProficiencyOptions = startingProficiencyOptions,
    subraces = subraces,
    traits = traits,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Race.toDocument() = RaceDocument(
    id = id,
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

fun RaceExample.toRaceDocument(): RaceDocument = RaceDocument(
    name = name
)
