package com.thejaxonhill.dnd5eapi.condition.usecase

import com.thejaxonhill.dnd5eapi.condition.port.LoadConditionPort
import org.springframework.stereotype.Service

@Service
class LoadConditions(private val loadConditionPort: LoadConditionPort) {
    fun load() = loadConditionPort.loadAll()
}