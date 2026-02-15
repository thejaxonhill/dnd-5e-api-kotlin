package com.thejaxonhill.dnd5eapi.skill.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.skill.domain.model.Skill
import com.thejaxonhill.dnd5eapi.skill.domain.model.SkillExample

interface SkillRepository {
    fun load(id: String): Skill?
    fun loadByIndex(index: String): Skill?
    fun loadAll(page: Page, example: SkillExample? = null): PagedModel<Skill>
    fun save(skill: Skill): Skill
}