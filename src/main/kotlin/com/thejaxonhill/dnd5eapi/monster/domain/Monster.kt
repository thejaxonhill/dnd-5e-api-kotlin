package com.thejaxonhill.dnd5eapi.monster.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.ActionType
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import com.thejaxonhill.dnd5eapi.shared.domain.model.Damage
import com.thejaxonhill.dnd5eapi.shared.domain.model.DifficultyClass
import java.time.LocalDateTime

data class Monster(
    val id: String? = null,
    val actions: List<MonsterAction>? = null,
    val alignment: String,
    val armorClass: List<MonsterArmorClass>,
    val challengeRating: Double,
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
    val updatedAt: LocalDateTime,
)

data class MonsterExample(val name: String?)

data class ActionOption(
    val actionName: String,
    val count: String,
    val type: ActionType,
)

data class ActionUsage(
    val type: String,
    val dice: String? = null,
    val minValue: Long? = null,
)

enum class ArmorClassType(val wireName: String) {
    ARMOR("armor"),
    CONDITION("condition"),
    DEX("dex"),
    NATURAL("natural"),
    SPELL("spell");

    companion object {
        fun fromWireName(value: String?): ArmorClassType? =
            entries.firstOrNull { it.wireName == value }
    }
}

data class LegendaryAction(
    val name: String,
    val desc: String,
    val attackBonus: Int? = null,
    val damage: List<Damage>? = null,
    val dc: DifficultyClass? = null,
)

data class MonsterAction(
    val name: String,
    val desc: String,
    val attackBonus: Long? = null,
    val damage: List<Damage>? = null,
    val dc: DifficultyClass? = null,
    val options: Choice? = null,
    val usage: ActionUsage? = null,
    val multiattackType: String? = null,
    val actions: List<ActionOption>? = null,
    val actionOptions: Choice? = null,
)

sealed class MonsterArmorClass(
    open val value: Int,
    open val desc: String? = null,
    val type: ArmorClassType,
) {
    data class Armor(
        override val value: Int,
        val armor: List<ApiReference>? = null,
        override val desc: String? = null,
    ) : MonsterArmorClass(value = value, desc = desc, type = ArmorClassType.ARMOR)

    data class Condition(
        override val value: Int,
        val condition: ApiReference,
        override val desc: String? = null,
    ) : MonsterArmorClass(value = value, desc = desc, type = ArmorClassType.CONDITION)

    data class Dex(
        override val value: Int,
        override val desc: String? = null,
    ) : MonsterArmorClass(value = value, desc = desc, type = ArmorClassType.DEX)

    data class Natural(
        override val value: Int,
        override val desc: String? = null,
    ) : MonsterArmorClass(value = value, desc = desc, type = ArmorClassType.NATURAL)

    data class Spell(
        override val value: Int,
        val spell: ApiReference,
        override val desc: String? = null,
    ) : MonsterArmorClass(value = value, desc = desc, type = ArmorClassType.SPELL)
}

data class MonsterProficiency(
    val proficiency: ApiReference,
    val value: Int,
)

data class Reaction(
    val name: String,
    val desc: String,
    val dc: DifficultyClass? = null,
)

data class Sense(
    val blindsight: String? = null,
    val darkvision: String? = null,
    val passivePerception: Int,
    val tremorsense: String? = null,
    val truesight: String? = null,
)

data class SpecialAbility(
    val name: String,
    val desc: String,
    val attackBonus: Int? = null,
    val damage: List<Damage>? = null,
    val dc: DifficultyClass? = null,
    val spellcasting: SpecialAbilitySpellcasting? = null,
    val usage: SpecialAbilityUsage? = null,
)

data class SpecialAbilitySpell(
    val name: String,
    val level: Int,
    val url: String,
    val notes: String?,
    val usage: SpecialAbilityUsage?,
)

data class SpecialAbilitySpellcasting(
    val level: Int? = null,
    val ability: ApiReference,
    val dc: Int? = null,
    val modifier: Int? = null,
    val componentsRequired: List<String>,
    val school: String? = null,
    val slots: Map<String, Int>? = null,
    val spells: List<SpecialAbilitySpell>,
)

data class SpecialAbilityUsage(
    val type: String,
    val times: Int? = null,
    val restTypes: List<String>? = null,
)

data class Speed(
    val burrow: String? = null,
    val climb: String? = null,
    val fly: String? = null,
    val hover: Boolean? = null,
    val swim: String? = null,
    val walk: String? = null,
)