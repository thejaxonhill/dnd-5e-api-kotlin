package com.thejaxonhill.dnd5eapi.equipment.port

import com.thejaxonhill.dnd5eapi.equipment.Equipment

interface LoadEquipmentPort {
    fun loadByIndex(index: String): Equipment?
    fun loadAll(): List<Equipment>
}