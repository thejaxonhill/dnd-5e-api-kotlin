package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.subclass.domain.Subclass
import com.thejaxonhill.dnd5eapi.subclass.domain.SubclassExample
import com.thejaxonhill.dnd5eapi.subclass.domain.SubclassRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoSubclassRepository(private val repository: SubclassMongoRepository) : SubclassRepository {
    override fun load(id: String): Subclass? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Subclass? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: SubclassExample?): PagedModel<Subclass> =
        repository.findAll(
            Example.of(example?.toSubclassDocument() ?: SubclassDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(subclass: Subclass) = repository.save(subclass.toDocument()).toDomain()
}

fun SubclassDocument.toDomain() = Subclass(
    id = id,
    characterClass = characterClass!!,
    desc = desc!!,
    index = index!!,
    name = name!!,
    spells = spells,
    subclassFlavor = subclassFlavor!!,
    subclassLevels = subclassLevels!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Subclass.toDocument() = SubclassDocument(
    id = id,
    characterClass = characterClass,
    desc = desc,
    index = index,
    name = name,
    spells = spells,
    subclassFlavor = subclassFlavor,
    subclassLevels = subclassLevels,
    url = url,
    updatedAt = updatedAt,
)

fun SubclassExample.toSubclassDocument(): SubclassDocument = SubclassDocument(
    name = name
)
