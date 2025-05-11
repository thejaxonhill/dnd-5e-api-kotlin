package com.thejaxonhill.dnd5eapi.abilityscore.usecase

import com.thejaxonhill.dnd5eapi.abilityscore.port.LoadAbilityScorePort
import org.springframework.stereotype.Service

@Service
class LoadAbilityScores(private val loadAbilityScorePort: LoadAbilityScorePort) {
    fun load() = loadAbilityScorePort.loadAll()
}