package com.thejaxonhill.dnd5eapi.monster.persistence

import com.thejaxonhill.dnd5eapi.monster.*
import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "monsters")
class MonsterDocument(
    @Id
    val id: String? = null,
    val actions: List<MonsterAction>? = null,
    val alignment: String,
    val armorClass: List<MonsterArmorClass>,
    val challengeRating: Long,
    val charisma: Int,
    val conditionImmunities: List<ApiReference>,
    val constitution: Int,
    val damageImmunities: List<String>,
    val damageResistances: List<String>,
    val damageVulnerabilities: List<String>,
    val dexterity: Int,
    val forms: List<ApiReference>? = null,
    val hitDice: String,
    val hitPoints: Int,
    val hitPointsRoll: String,
    val image: String? = null,
    val index: String,
    val intelligence: Int,
    val languages: String,
    val legendaryActions: List<LegendaryAction>? = null,
    val name: String,
    val proficiencies: List<MonsterProficiency>,
    val reactions: List<Reaction>? = null,
    val senses: Sense,
    val size: String,
    val specialAbilities: List<SpecialAbility>? = null,
    val speed: Speed,
    val strength: Int,
    val subtype: String? = null,
    val type: String,
    val url: String,
    val wisdom: Int,
    val xp: Long,
    val updatedAt: Date,
)