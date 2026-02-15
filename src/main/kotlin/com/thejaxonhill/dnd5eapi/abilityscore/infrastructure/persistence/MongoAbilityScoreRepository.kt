package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreExample
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoAbilityScoreRepository(private val repository: AbilityScoreMongoRepository) : AbilityScoreRepository {
    override fun load(id: String): AbilityScore? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): AbilityScore? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: AbilityScoreExample?): PagedModel<AbilityScore> =
        repository.findAll(
            Example.of(example?.toAbilityScoreDocument() ?: AbilityScoreDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(abilityScore: AbilityScore) = repository.save(abilityScore.toDocument()).toDomain()
}

fun AbilityScore.toDocument() = AbilityScoreDocument(
    id = id,
    desc = desc,
    fullName = fullName,
    index = index,
    name = name,
    skills = skills,
    url = url,
    updatedAt = updatedAt,
)

fun AbilityScoreDocument.toDomain() = AbilityScore(
    desc = desc,
    fullName = fullName,
    index = index,
    name = name,
    skills = skills,
    url = url,
    updatedAt = updatedAt,
)

fun AbilityScoreExample.toAbilityScoreDocument(): AbilityScoreDocument = AbilityScoreDocument(name = name)

