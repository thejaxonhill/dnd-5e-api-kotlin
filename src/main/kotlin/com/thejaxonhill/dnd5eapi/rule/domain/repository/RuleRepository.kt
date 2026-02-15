package com.thejaxonhill.dnd5eapi.rule.domain.repository

import com.thejaxonhill.dnd5eapi.rule.domain.model.Rule
import com.thejaxonhill.dnd5eapi.rule.domain.model.RuleExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface RuleRepository {
    fun load(id: String): Rule?
    fun loadByIndex(index: String): Rule?
    fun loadAll(page: Page, example: RuleExample? = null): PagedModel<Rule>
    fun save(rule: Rule): Rule
}
