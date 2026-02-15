package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.model.*
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "monsters")
data class MonsterDocument(
    @Id
    val id: String? = null,
    val actions: List<MonsterAction>? = null,
    val alignment: String? = null,
    val armorClass: List<MonsterArmorClass>? = null,
    val challengeRating: Double? = null,
    val charisma: Int? = null,
    val conditionImmunities: List<ApiReference>? = null,
    val constitution: Int? = null,
    val damageImmunities: List<String>? = null,
    val damageResistances: List<String>? = null,
    val damageVulnerabilities: List<String>? = null,
    val dexterity: Int? = null,
    val forms: List<ApiReference>? = null,
    val hitDice: String? = null,
    val hitPoints: Int? = null,
    val hitPointsRoll: String? = null,
    val image: String? = null,
    val index: String? = null,
    val intelligence: Int? = null,
    val languages: String? = null,
    val legendaryActions: List<LegendaryAction>? = null,
    val name: String? = null,
    val proficiencies: List<MonsterProficiency>? = null,
    val reactions: List<Reaction>? = null,
    val senses: Sense? = null,
    val size: String? = null,
    val specialAbilities: List<SpecialAbility>? = null,
    val speed: Speed? = null,
    val strength: Int? = null,
    val subtype: String? = null,
    val type: String? = null,
    val url: String? = null,
    val wisdom: Int? = null,
    val xp: Long? = null,
    val updatedAt: Date? = null
)