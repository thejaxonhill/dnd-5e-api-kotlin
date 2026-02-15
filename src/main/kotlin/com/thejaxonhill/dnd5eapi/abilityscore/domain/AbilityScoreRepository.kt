package com.thejaxonhill.dnd5eapi.abilityscore.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface AbilityScoreRepository {
    fun load(id: String): AbilityScore?
    fun loadByIndex(index: String): AbilityScore?
    fun loadAll(page: Page, example: AbilityScoreExample? = null): PagedModel<AbilityScore>
    fun save(abilityScore: AbilityScore): AbilityScore
}