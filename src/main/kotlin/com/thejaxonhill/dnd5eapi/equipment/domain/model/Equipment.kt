package com.thejaxonhill.dnd5eapi.equipment.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Damage
import java.time.LocalDateTime

data class Equipment(
    val id: String? = null,
    val armorCategory: String? = null,
    val armorClass: ArmorClass? = null,
    val capacity: String? = null,
    val categoryRange: String? = null,
    val contents: List<Content>? = null,
    val cost: Cost,
    val damage: Damage? = null,
    val desc: String? = null,
    val equipmentCategory: ApiReference,
    val gearCategory: ApiReference? = null,
    val index: String,
    val name: String,
    val properties: List<ApiReference>? = null,
    val quantity: Int? = null,
    val range: Range? = null,
    val special: List<String>? = null,
    val speed: Speed? = null,
    val stealthDisadvantage: Boolean? = null,
    val strMinimum: Int? = null,
    val throwRange: ThrowRange? = null,
    val toolCategory: String? = null,
    val twoHandedDamage: TwoHandedDamage? = null,
    val vehicleCategory: String? = null,
    val weaponCategory: String? = null,
    val weaponRange: String? = null,
    val weight: Double? = null,
    val url: String,
    val updatedAt: LocalDateTime
)

data class EquipmentExample(val name: String? = null)
