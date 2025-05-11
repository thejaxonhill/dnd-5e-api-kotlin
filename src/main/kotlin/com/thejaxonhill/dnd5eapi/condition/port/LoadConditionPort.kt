package com.thejaxonhill.dnd5eapi.condition.port

import com.thejaxonhill.dnd5eapi.condition.Condition

interface LoadConditionPort {
    fun loadByIndex(index: String): Condition?
    fun loadAll(): List<Condition>
}