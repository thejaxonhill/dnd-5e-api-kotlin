package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.LegendaryAction
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterAction
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterArmorClass
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterProficiency
import com.thejaxonhill.dnd5eapi.monster.domain.Reaction
import com.thejaxonhill.dnd5eapi.monster.domain.Sense
import com.thejaxonhill.dnd5eapi.monster.domain.SpecialAbility
import com.thejaxonhill.dnd5eapi.monster.domain.Speed
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "monsters")
class MonsterDocument(
    @Id
    var id: String? = null,
    var actions: List<MonsterAction>? = null,
    var alignment: String? = null,
    var armorClass: List<MonsterArmorClass>? = null,
    var challengeRating: Double? = null,
    var charisma: Int? = null,
    var conditionImmunities: List<ApiReference>? = null,
    var constitution: Int? = null,
    var damageImmunities: List<String>? = null,
    var damageResistances: List<String>? = null,
    var damageVulnerabilities: List<String>? = null,
    var dexterity: Int? = null,
    var forms: List<ApiReference>? = null,
    var hitDice: String? = null,
    var hitPoints: Int? = null,
    var hitPointsRoll: String? = null,
    var image: String? = null,
    var index: String? = null,
    var intelligence: Int? = null,
    var languages: String? = null,
    var legendaryActions: List<LegendaryAction>? = null,
    var name: String? = null,
    var proficiencies: List<MonsterProficiency>? = null,
    var reactions: List<Reaction>? = null,
    var senses: Sense? = null,
    var size: String? = null,
    var specialAbilities: List<SpecialAbility>? = null,
    var speed: Speed? = null,
    var strength: Int? = null,
    var subtype: String? = null,
    var type: String? = null,
    var url: String? = null,
    var wisdom: Int? = null,
    var xp: Long? = null,
    var updatedAt: LocalDateTime? = null
)