package com.thejaxonhill.dnd5eapi.abilityscore.port

import com.thejaxonhill.dnd5eapi.abilityscore.AbilityScore

interface LoadAbilityScorePort {
    fun loadByIndex(index: String): AbilityScore?
    fun loadAll(): List<AbilityScore>
}