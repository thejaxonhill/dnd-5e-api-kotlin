package com.thejaxonhill.dnd5eapi.skill.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.skill.domain.model.Skill
import com.thejaxonhill.dnd5eapi.skill.domain.model.SkillExample
import com.thejaxonhill.dnd5eapi.skill.domain.repository.SkillRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoSkillRepository(private val repository: SkillMongoRepository) : SkillRepository {
    override fun load(id: String): Skill? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Skill? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: SkillExample?): PagedModel<Skill> =
        repository.findAll(
            Example.of(example?.toSkillDocument() ?: SkillDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(skill: Skill) = repository.save(skill.toDocument()).toDomain()
}

fun SkillDocument.toDomain() = Skill(
    id = id,
    abilityScore = abilityScore!!,
    desc = desc!!,
    index = index!!,
    name = name!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Skill.toDocument() = SkillDocument(
    id = id,
    abilityScore = abilityScore,
    desc = desc,
    index = index,
    name = name,
    url = url,
    updatedAt = updatedAt,
)

fun SkillExample.toSkillDocument(): SkillDocument = SkillDocument(
    name = name
)
