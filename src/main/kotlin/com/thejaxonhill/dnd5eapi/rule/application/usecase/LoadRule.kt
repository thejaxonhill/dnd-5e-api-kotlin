package com.thejaxonhill.dnd5eapi.rule.application.usecase

import com.thejaxonhill.dnd5eapi.rule.domain.repository.LoadRulePort
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRule(private val loadRulePort: LoadRulePort) {
    fun load(index: String) = loadRulePort.loadByIndex(index) ?: throw NotFoundException()
}