package com.thejaxonhill.dnd5eapi.abilityscore.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.port.LoadAbilityScorePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadAbilityScore(private val loadAbilityScorePort: LoadAbilityScorePort) {
    fun load(index: String) = loadAbilityScorePort.loadByIndex(index) ?: throw NotFoundException()
}