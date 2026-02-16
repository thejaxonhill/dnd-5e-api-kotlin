package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.characterclass.domain.CharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.domain.CharacterClassExample
import com.thejaxonhill.dnd5eapi.characterclass.domain.CharacterClassRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoCharacterClassRepository(private val repository: CharacterClassMongoRepository) : CharacterClassRepository {
    override fun load(id: String): CharacterClass? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): CharacterClass? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: CharacterClassExample?): PagedModel<CharacterClass> =
        repository.findAll(
            Example.of(example?.toCharacterClassDocument() ?: CharacterClassDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(characterClass: CharacterClass) = repository.save(characterClass.toDocument()).toDomain()
}

fun CharacterClassDocument.toDomain() = CharacterClass(
    id = id,
    classLevels = classLevels!!,
    hitDie = hitDie!!,
    index = index!!,
    name = name!!,
    proficiencies = proficiencies!!,
    proficiencyChoices = proficiencyChoices!!,
    savingThrows = savingThrows!!,
    spellcasting = spellcasting,
    spells = spells,
    startingEquipment = startingEquipment,
    startingEquipmentOptions = startingEquipmentOptions!!,
    multiClassing = multiClassing!!,
    subclasses = subclasses!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun CharacterClass.toDocument() = CharacterClassDocument(
    id = id,
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

fun CharacterClassExample.toCharacterClassDocument(): CharacterClassDocument = CharacterClassDocument(
    name = name
)
