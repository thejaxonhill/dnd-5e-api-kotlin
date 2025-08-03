package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencies
import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiency
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class ProficiencyTools(
    private val loadProficiency: LoadProficiency,
    private val loadProficiencies: LoadProficiencies
) {
    @Tool
    fun getProficiencies() = loadProficiencies.load()

    @Tool
    fun getProficiency(index: String) = loadProficiency.load(index)
}