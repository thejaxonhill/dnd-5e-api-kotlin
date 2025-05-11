package com.thejaxonhill.dnd5eapi.proficiency.usecase

import com.thejaxonhill.dnd5eapi.proficiency.port.LoadProficiencyPort
import org.springframework.stereotype.Service

@Service
class LoadProficiencies(private val loadProficiencyPort: LoadProficiencyPort) {
    fun load() = loadProficiencyPort.loadAll()
}