package com.thejaxonhill.dnd5eapi.equipment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.equipment.domain.model.*
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Damage
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "equipment")
class EquipmentDocument(
    @Id
    var id: String? = null,
    var armorCategory: String? = null,
    var armorClass: ArmorClass? = null,
    var capacity: String? = null,
    var categoryRange: String? = null,
    var contents: List<Content>? = null,
    var cost: Cost? = null,
    var damage: Damage? = null,
    var desc: String? = null,
    var equipmentCategory: ApiReference? = null,
    var gearCategory: ApiReference? = null,
    var index: String? = null,
    var name: String? = null,
    var properties: List<ApiReference>? = null,
    var quantity: Int? = null,
    var range: Range? = null,
    var special: List<String>? = null,
    var speed: Speed? = null,
    var stealthDisadvantage: Boolean? = null,
    var strMinimum: Int? = null,
    var throwRange: ThrowRange? = null,
    var toolCategory: String? = null,
    var twoHandedDamage: TwoHandedDamage? = null,
    var vehicleCategory: String? = null,
    var weaponCategory: String? = null,
    var weaponRange: String? = null,
    var weight: Double? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)