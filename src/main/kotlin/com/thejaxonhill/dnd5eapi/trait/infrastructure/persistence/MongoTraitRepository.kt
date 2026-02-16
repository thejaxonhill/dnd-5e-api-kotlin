package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.trait.domain.Trait
import com.thejaxonhill.dnd5eapi.trait.domain.TraitExample
import com.thejaxonhill.dnd5eapi.trait.domain.TraitRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoTraitRepository(private val repository: TraitMongoRepository) : TraitRepository {
    override fun load(id: String): Trait? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Trait? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: TraitExample?): PagedModel<Trait> =
        repository.findAll(
            Example.of(example?.toTraitDocument() ?: TraitDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(trait: Trait) = repository.save(trait.toDocument()).toDomain()
}

fun TraitDocument.toDomain() = Trait(
    id = id,
    desc = desc!!,
    index = index!!,
    name = name!!,
    proficiencies = proficiencies,
    proficiencyChoices = proficiencyChoices,
    languageOptions = languageOptions,
    races = races!!,
    subraces = subraces!!,
    parent = parent,
    traitSpecific = traitSpecific,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Trait.toDocument() = TraitDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    proficiencies = proficiencies,
    proficiencyChoices = proficiencyChoices,
    languageOptions = languageOptions,
    races = races,
    subraces = subraces,
    parent = parent,
    traitSpecific = traitSpecific,
    url = url,
    updatedAt = updatedAt,
)

fun TraitExample.toTraitDocument(): TraitDocument = TraitDocument(
    name = name
)
