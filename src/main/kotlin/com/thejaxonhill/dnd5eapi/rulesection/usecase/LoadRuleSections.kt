package com.thejaxonhill.dnd5eapi.rulesection.usecase

import com.thejaxonhill.dnd5eapi.rulesection.port.LoadRuleSectionPort
import org.springframework.stereotype.Service

@Service
class LoadRuleSections(private val loadRuleSectionPort: LoadRuleSectionPort) {
    fun load() = loadRuleSectionPort.loadAll()
}