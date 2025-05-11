package com.thejaxonhill.dnd5eapi.rulesection.usecase

import com.thejaxonhill.dnd5eapi.rulesection.port.LoadRuleSectionPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadRuleSection(private val loadRuleSectionPort: LoadRuleSectionPort) {
    fun load(index: String) = loadRuleSectionPort.loadByIndex(index) ?:
    throw NotFoundException()
}