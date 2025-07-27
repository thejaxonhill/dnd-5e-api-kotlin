package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.model.Monster
import com.thejaxonhill.dnd5eapi.monster.domain.repository.MonsterRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MonsterMongoAdapter(repository: MonsterMongoRepository) :
    MongoAdapter<Monster, MonsterDocument>(repository),
    MonsterRepository {
    override fun MonsterDocument.toDomain() = Monster(
        actions = actions,
        alignment = alignment,
        armorClass = armorClass,
        challengeRating = challengeRating,
        charisma = charisma,
        conditionImmunities = conditionImmunities,
        constitution = constitution,
        damageImmunities = damageImmunities,
        damageResistances = damageResistances,
        damageVulnerabilities = damageVulnerabilities,
        dexterity = dexterity,
        forms = forms,
        hitDice = hitDice,
        hitPoints = hitPoints,
        hitPointsRoll = hitPointsRoll,
        image = image,
        index = index,
        intelligence = intelligence,
        languages = languages,
        legendaryActions = legendaryActions,
        name = name,
        proficiencies = proficiencies,
        reactions = reactions,
        senses = senses,
        size = size,
        specialAbilities = specialAbilities,
        speed = speed,
        strength = strength,
        subtype = subtype,
        type = type,
        url = url,
        wisdom = wisdom,
        xp = xp,
        updatedAt = updatedAt,
    )
}