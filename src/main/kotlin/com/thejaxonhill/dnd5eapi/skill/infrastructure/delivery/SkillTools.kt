package com.thejaxonhill.dnd5eapi.skill.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkillByIndex
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkills
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SkillTools(
    private val loadSkillByIndex: LoadSkillByIndex,
    private val loadSkills: LoadSkills
) {
    @Tool
    fun getSkills(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadSkills.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getSkill(index: String) = loadSkillByIndex.load(index)
}