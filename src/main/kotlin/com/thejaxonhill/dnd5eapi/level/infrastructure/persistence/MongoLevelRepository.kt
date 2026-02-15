package com.thejaxonhill.dnd5eapi.level.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.level.domain.model.Level
import com.thejaxonhill.dnd5eapi.level.domain.model.LevelExample
import com.thejaxonhill.dnd5eapi.level.domain.repository.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoLevelRepository(private val repository: LevelMongoRepository) : LevelRepository {
    override fun load(id: String): Level? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Level? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: LevelExample?): PagedModel<Level> =
        repository.findAll(
            Example.of(example?.toLevelDocument() ?: LevelDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(level: Level) = repository.save(level.toDocument()).toDomain()
}

fun LevelDocument.toDomain() = Level(
    id = id,
    abilityScoreBonuses = abilityScoreBonuses,
    characterClass = characterClass!!,
    classSpecific = classSpecific,
    features = features!!,
    index = index!!,
    level = level!!,
    profBonus = profBonus,
    spellcasting = spellcasting,
    subclass = subclass,
    subclassSpecific = subclassSpecific,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Level.toDocument() = LevelDocument(
    id = id,
    abilityScoreBonuses = abilityScoreBonuses,
    characterClass = characterClass,
    classSpecific = classSpecific,
    features = features,
    index = index,
    level = level,
    profBonus = profBonus,
    spellcasting = spellcasting,
    subclass = subclass,
    subclassSpecific = subclassSpecific,
    url = url,
    updatedAt = updatedAt,
)

fun LevelExample.toLevelDocument(): LevelDocument = LevelDocument(
    level = level
)
