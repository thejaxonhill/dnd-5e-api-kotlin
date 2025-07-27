package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.domain.repository.CharacterClassRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class CharacterClassMongoAdapter(repository: CharacterClassMongoRepository) :
    MongoAdapter<CharacterClass, CharacterClassDocument>(repository),
    CharacterClassRepository {
    override fun CharacterClassDocument.toDomain() = CharacterClass(
        classLevels = classLevels,
        hitDie = hitDie,
        index = index,
        name = name,
        proficiencies = proficiencies,
        proficiencyChoices = proficiencyChoices,
        savingThrows = savingThrows,
        spellcasting = spellcasting,
        spells = spells,
        startingEquipment = startingEquipment,
        startingEquipmentOptions = startingEquipmentOptions,
        multiClassing = multiClassing,
        subclasses = subclasses,
        url = url,
        updatedAt = updatedAt,
    )
}