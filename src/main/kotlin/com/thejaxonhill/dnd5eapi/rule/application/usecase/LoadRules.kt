package com.thejaxonhill.dnd5eapi.rule.application.usecase

import com.thejaxonhill.dnd5eapi.rule.domain.repository.LoadRulePort
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRules(private val loadRulePort: LoadRulePort) {
    fun load() = loadRulePort.loadAll()
}