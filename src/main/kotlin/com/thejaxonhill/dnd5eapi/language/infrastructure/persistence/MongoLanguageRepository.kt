package com.thejaxonhill.dnd5eapi.language.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.language.domain.Language
import com.thejaxonhill.dnd5eapi.language.domain.LanguageExample
import com.thejaxonhill.dnd5eapi.language.domain.LanguageRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoLanguageRepository(private val repository: LanguageMongoRepository) : LanguageRepository {
    override fun load(id: String): Language? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Language? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: LanguageExample?): PagedModel<Language> =
        repository.findAll(
            Example.of(example?.toLanguageDocument() ?: LanguageDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(language: Language) = repository.save(language.toDocument()).toDomain()
}

fun LanguageDocument.toDomain() = Language(
    id = id,
    desc = desc,
    index = index!!,
    name = name!!,
    script = script,
    type = type!!,
    typicalSpeakers = typicalSpeakers!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Language.toDocument() = LanguageDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    script = script,
    type = type,
    typicalSpeakers = typicalSpeakers,
    url = url,
    updatedAt = updatedAt,
)

fun LanguageExample.toLanguageDocument(): LanguageDocument = LanguageDocument(
    name = name
)
