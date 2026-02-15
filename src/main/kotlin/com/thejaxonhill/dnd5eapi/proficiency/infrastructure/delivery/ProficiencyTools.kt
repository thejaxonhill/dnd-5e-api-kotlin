package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencyByIndex
import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencies
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class ProficiencyTools(
    private val loadProficiencyByIndex: LoadProficiencyByIndex,
    private val loadProficiencies: LoadProficiencies
) {
    @Tool
    fun getProficiencies(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadProficiencies.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getProficiency(index: String) = loadProficiencyByIndex.load(index)
}