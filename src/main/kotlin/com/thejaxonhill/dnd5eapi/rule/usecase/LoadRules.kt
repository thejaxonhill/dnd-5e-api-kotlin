package com.thejaxonhill.dnd5eapi.rule.usecase

import com.thejaxonhill.dnd5eapi.rule.port.LoadRulePort
import org.springframework.stereotype.Service

@Service
class LoadRules(private val loadRulePort: LoadRulePort) {
    fun load() = loadRulePort.loadAll()
}