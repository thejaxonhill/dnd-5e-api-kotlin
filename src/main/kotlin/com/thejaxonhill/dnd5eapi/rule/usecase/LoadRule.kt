package com.thejaxonhill.dnd5eapi.rule.usecase

import com.thejaxonhill.dnd5eapi.rule.port.LoadRulePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadRule(private val loadRulePort: LoadRulePort) {
    fun load(index: String) = loadRulePort.loadByIndex(index) ?: throw NotFoundException()
}