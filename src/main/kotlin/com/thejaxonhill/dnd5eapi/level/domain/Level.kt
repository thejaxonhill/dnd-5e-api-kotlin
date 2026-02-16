package com.thejaxonhill.dnd5eapi.level.domain

import com.fasterxml.jackson.annotation.JsonProperty
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import java.time.LocalDateTime

data class Level(
    val id: String? = null,
    val abilityScoreBonuses: Long? = null,
    @get:JsonProperty("class")
    val characterClass: ApiReference,
    val classSpecific: ClassSpecific? = null,
    val features: List<ApiReference>,
    val index: String,
    val level: Int,
    val profBonus: Int? = null,
    val spellcasting: SpellcastingSlots? = null,
    val subclass: ApiReference?,
    val subclassSpecific: SubclassSpecific?,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class LevelExample(val level: Int?)
data class ClassSpecific(
    val actionSurges: Int? = null,
    val arcaneRecoveryLevels: Int? = null,
    val auraRange: Long? = null,
    val bardicInspirationDie: Int? = null,
    val brutalCriticalDice: Int? = null,
    val channelDivinityCharges: Int? = null,
    val creatingSpellSlots: List<ClassSpecificCreatingSpellSlot>? = null,
    val destroyUndeadCr: Int? = null,
    val extraAttacks: Int? = null,
    val favoredEnemies: Int? = null,
    val favoredTerrain: Int? = null,
    val indomitableUses: Int? = null,
    val invocationsKnown: Int? = null,
    val kiPoints: Int? = null,
    val magicalSecretsMax5: Int? = null,
    val magicalSecretsMax7: Int? = null,
    val magicalSecretsMax9: Int? = null,
    val martialArts: ClassSpecificMartialArt? = null,
    val metamagicKnown: Int? = null,
    val mysticArcanumLevel6: Int? = null,
    val mysticArcanumLevel7: Int? = null,
    val mysticArcanumLevel8: Int? = null,
    val mysticArcanumLevel9: Int? = null,
    val rageCount: Int? = null,
    val rageDamageBonus: Int? = null,
    val sneakAttack: ClassSpecificSneakAttack? = null,
    val songOfRestDie: Int? = null,
    val sorceryPoints: Int? = null,
    val unarmoredMovement: Long? = null,
    val wildShapeFly: Boolean? = null,
    val wildShapeMaxCr: Int? = null,
    val wildShapeSwim: Boolean? = null,
)

data class ClassSpecificCreatingSpellSlot(
    val sorceryPointCost: Int,
    val spellSlotLevel: Int,
)

data class ClassSpecificMartialArt(
    val diceCount: Int,
    val diceValue: Int,
)

data class ClassSpecificSneakAttack(
    val diceCount: Int,
    val diceValue: Int,
)

data class SpellcastingSlots(
    val cantripsKnown: Int? = null,
    val spellSlotsLevel1: Int? = null,
    val spellSlotsLevel2: Int? = null,
    val spellSlotsLevel3: Int? = null,
    val spellSlotsLevel4: Int? = null,
    val spellSlotsLevel5: Int? = null,
    val spellSlotsLevel6: Int? = null,
    val spellSlotsLevel7: Int? = null,
    val spellSlotsLevel8: Int? = null,
    val spellSlotsLevel9: Int? = null,
    val spellsKnown: Int? = null,
)

data class SubclassSpecific(
    val additionalMagicalSecretsMaxLvl: Int? = null,
    val auraRange: Long? = null,
)