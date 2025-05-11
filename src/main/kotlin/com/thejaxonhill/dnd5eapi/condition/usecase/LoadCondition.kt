package com.thejaxonhill.dnd5eapi.condition.usecase

import com.thejaxonhill.dnd5eapi.condition.port.LoadConditionPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadCondition(private val loadConditionPort: LoadConditionPort) {
    fun load(index: String) = loadConditionPort.loadByIndex(index) ?: throw NotFoundException()
}