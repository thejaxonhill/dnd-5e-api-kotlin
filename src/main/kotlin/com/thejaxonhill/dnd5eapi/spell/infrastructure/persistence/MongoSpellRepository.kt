package com.thejaxonhill.dnd5eapi.spell.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.spell.domain.Spell
import com.thejaxonhill.dnd5eapi.spell.domain.SpellExample
import com.thejaxonhill.dnd5eapi.spell.domain.SpellRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoSpellRepository(private val repository: SpellMongoRepository) : SpellRepository {
    override fun load(id: String): Spell? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Spell? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: SpellExample?): PagedModel<Spell> =
        repository.findAll(
            Example.of(example?.toSpellDocument() ?: SpellDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(spell: Spell) = repository.save(spell.toDocument()).toDomain()
}

fun SpellDocument.toDomain() = Spell(
    id = id,
    areaOfEffect = areaOfEffect,
    attackType = attackType,
    castingTime = castingTime!!,
    classes = classes!!,
    components = components!!,
    concentration = concentration!!,
    damage = damage,
    dc = dc,
    desc = desc!!,
    duration = duration!!,
    healAtSlotLevel = healAtSlotLevel,
    higherLevel = higherLevel,
    index = index!!,
    level = level!!,
    material = material,
    name = name!!,
    range = range!!,
    ritual = ritual!!,
    school = school!!,
    subclasses = subclasses!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Spell.toDocument() = SpellDocument(
    id = id,
    areaOfEffect = areaOfEffect,
    attackType = attackType,
    castingTime = castingTime,
    classes = classes,
    components = components,
    concentration = concentration,
    damage = damage,
    dc = dc,
    desc = desc,
    duration = duration,
    healAtSlotLevel = healAtSlotLevel,
    higherLevel = higherLevel,
    index = index,
    level = level,
    material = material,
    name = name,
    range = range,
    ritual = ritual,
    school = school,
    subclasses = subclasses,
    url = url,
    updatedAt = updatedAt,
)

fun SpellExample.toSpellDocument(): SpellDocument = SpellDocument(
    name = name
)
