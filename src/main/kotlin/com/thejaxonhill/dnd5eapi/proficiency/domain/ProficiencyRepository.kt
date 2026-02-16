package com.thejaxonhill.dnd5eapi.proficiency.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface ProficiencyRepository {
    fun load(id: String): Proficiency?
    fun loadByIndex(index: String): Proficiency?
    fun loadAll(page: Page, example: ProficiencyExample? = null): PagedModel<Proficiency>
    fun save(proficiency: Proficiency): Proficiency
}