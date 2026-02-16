package com.thejaxonhill.dnd5eapi.skill.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface SkillRepository {
    fun load(id: String): Skill?
    fun loadByIndex(index: String): Skill?
    fun loadAll(page: Page, example: SkillExample? = null): PagedModel<Skill>
    fun save(skill: Skill): Skill
}