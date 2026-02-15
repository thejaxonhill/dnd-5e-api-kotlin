package com.thejaxonhill.dnd5eapi.condition.domain.repository

import com.thejaxonhill.dnd5eapi.condition.domain.model.Condition
import com.thejaxonhill.dnd5eapi.condition.domain.model.ConditionExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface ConditionRepository {
    fun load(id: String): Condition?
    fun loadByIndex(index: String): Condition?
    fun loadAll(page: Page, example: ConditionExample? = null): PagedModel<Condition>
    fun save(condition: Condition): Condition
}