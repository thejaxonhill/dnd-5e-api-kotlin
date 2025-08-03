package com.thejaxonhill.dnd5eapi.skill.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkill
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkills
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SkillTools(
    private val loadSkill: LoadSkill,
    private val loadSkills: LoadSkills
) {
    @Tool
    fun getSkills() = loadSkills.load()

    @Tool
    fun getSkill(index: String) = loadSkill.load(index)
}