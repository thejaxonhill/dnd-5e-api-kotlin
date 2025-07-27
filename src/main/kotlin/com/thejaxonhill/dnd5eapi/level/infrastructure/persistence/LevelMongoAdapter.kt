package com.thejaxonhill.dnd5eapi.level.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.level.domain.model.Level
import com.thejaxonhill.dnd5eapi.level.domain.repository.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class LevelMongoAdapter(repository: LevelMongoRepository) :
    MongoAdapter<Level, LevelDocument>(repository),
    LevelRepository {
    override fun LevelDocument.toDomain() = Level(
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
}