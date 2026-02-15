package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicschool.application.usecase.LoadMagicSchoolByIndex
import com.thejaxonhill.dnd5eapi.magicschool.application.usecase.LoadMagicSchools
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MagicSchoolTools(
    private val loadMagicSchoolByIndex: LoadMagicSchoolByIndex,
    private val loadMagicSchools: LoadMagicSchools
) {
    @Tool
    fun getMagicSchools(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadMagicSchools.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getMagicSchool(index: String) = loadMagicSchoolByIndex.load(index)
}