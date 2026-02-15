package com.thejaxonhill.dnd5eapi.rulesection.domain.repository

import com.thejaxonhill.dnd5eapi.rulesection.domain.model.RuleSection
import com.thejaxonhill.dnd5eapi.rulesection.domain.model.RuleSectionExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface RuleSectionRepository {
    fun load(id: String): RuleSection?
    fun loadByIndex(index: String): RuleSection?
    fun loadAll(page: Page, example: RuleSectionExample? = null): PagedModel<RuleSection>
    fun save(ruleSection: RuleSection): RuleSection
}