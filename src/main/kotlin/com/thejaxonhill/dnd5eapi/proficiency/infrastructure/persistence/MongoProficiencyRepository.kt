package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.proficiency.domain.model.Proficiency
import com.thejaxonhill.dnd5eapi.proficiency.domain.model.ProficiencyExample
import com.thejaxonhill.dnd5eapi.proficiency.domain.repository.ProficiencyRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoProficiencyRepository(private val repository: ProficiencyMongoRepository) : ProficiencyRepository {
    override fun load(id: String): Proficiency? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Proficiency? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: ProficiencyExample?): PagedModel<Proficiency> =
        repository.findAll(
            Example.of(example?.toProficiencyDocument() ?: ProficiencyDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(proficiency: Proficiency) = repository.save(proficiency.toDocument()).toDomain()
}

fun ProficiencyDocument.toDomain() = Proficiency(
    id = id,
    classes = classes,
    index = index!!,
    name = name!!,
    races = races,
    reference = reference!!,
    type = type!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Proficiency.toDocument() = ProficiencyDocument(
    id = id,
    classes = classes,
    index = index,
    name = name,
    races = races,
    reference = reference,
    type = type,
    url = url,
    updatedAt = updatedAt,
)

fun ProficiencyExample.toProficiencyDocument(): ProficiencyDocument = ProficiencyDocument(
    name = name
)
