package com.thejaxonhill.dnd5eapi.spell.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.spell.domain.model.Spell
import com.thejaxonhill.dnd5eapi.spell.domain.repository.SpellRepository
import org.springframework.stereotype.Component

@Component
class SpellMongoAdapter(repository: SpellMongoRepository) :
    MongoAdapter<Spell, SpellDocument>(repository),
    SpellRepository {
    override fun SpellDocument.toDomain() = Spell(
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
}