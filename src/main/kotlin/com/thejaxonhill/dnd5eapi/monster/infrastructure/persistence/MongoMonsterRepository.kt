package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.model.Monster
import com.thejaxonhill.dnd5eapi.monster.domain.model.MonsterExample
import com.thejaxonhill.dnd5eapi.monster.domain.repository.MonsterRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoMonsterRepository(private val repository: MonsterMongoRepository) : MonsterRepository {
    override fun load(id: String): Monster? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Monster? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: MonsterExample?): PagedModel<Monster> =
        repository.findAll(
            Example.of(example?.toMonsterDocument() ?: MonsterDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(monster: Monster) = repository.save(monster.toDocument()).toDomain()
}

fun MonsterDocument.toDomain() = Monster(
    id = id,
    actions = actions,
    alignment = alignment!!,
    armorClass = armorClass!!,
    challengeRating = challengeRating!!,
    charisma = charisma!!,
    conditionImmunities = conditionImmunities!!,
    constitution = constitution!!,
    damageImmunities = damageImmunities!!,
    damageResistances = damageResistances!!,
    damageVulnerabilities = damageVulnerabilities!!,
    dexterity = dexterity!!,
    forms = forms,
    hitDice = hitDice!!,
    hitPoints = hitPoints!!,
    hitPointsRoll = hitPointsRoll!!,
    image = image,
    index = index!!,
    intelligence = intelligence!!,
    languages = languages!!,
    legendaryActions = legendaryActions,
    name = name!!,
    proficiencies = proficiencies!!,
    reactions = reactions,
    senses = senses!!,
    size = size!!,
    specialAbilities = specialAbilities,
    speed = speed!!,
    strength = strength!!,
    subtype = subtype,
    type = type!!,
    url = url!!,
    wisdom = wisdom!!,
    xp = xp!!,
    updatedAt = updatedAt!!,
)

fun Monster.toDocument() = MonsterDocument(
    id = id,
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

fun MonsterExample.toMonsterDocument(): MonsterDocument = MonsterDocument(
    name = name
)
