package com.thejaxonhill.dnd5eapi.damagetype.port

import com.thejaxonhill.dnd5eapi.damagetype.DamageType

interface LoadDamageTypePort {
    fun loadByIndex(index: String): DamageType?
    fun loadAll(): List<DamageType>
}