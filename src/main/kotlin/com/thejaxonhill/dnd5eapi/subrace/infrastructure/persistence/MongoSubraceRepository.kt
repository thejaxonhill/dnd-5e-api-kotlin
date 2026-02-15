package com.thejaxonhill.dnd5eapi.subrace.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.subrace.domain.model.Subrace
import com.thejaxonhill.dnd5eapi.subrace.domain.model.SubraceExample
import com.thejaxonhill.dnd5eapi.subrace.domain.repository.SubraceRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoSubraceRepository(private val repository: SubraceMongoRepository) : SubraceRepository {
    override fun load(id: String): Subrace? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Subrace? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: SubraceExample?): PagedModel<Subrace> =
        repository.findAll(
            Example.of(example?.toSubraceDocument() ?: SubraceDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(subrace: Subrace) = repository.save(subrace.toDocument()).toDomain()
}

fun SubraceDocument.toDomain() = Subrace(
    id = id,
    abilityBonuses = abilityBonuses!!,
    desc = desc!!,
    index = index!!,
    languages = languages,
    languageOptions = languageOptions,
    name = name!!,
    race = race!!,
    racialTraits = racialTraits!!,
    startingProficiencies = startingProficiencies,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Subrace.toDocument() = SubraceDocument(
    id = id,
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

fun SubraceExample.toSubraceDocument(): SubraceDocument = SubraceDocument(
    name = name
)
