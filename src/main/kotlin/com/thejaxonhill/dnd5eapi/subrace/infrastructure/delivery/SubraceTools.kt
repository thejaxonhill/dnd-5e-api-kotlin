package com.thejaxonhill.dnd5eapi.subrace.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubraceByIndex
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubraces
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SubraceTools(
    private val loadSubraceByIndex: LoadSubraceByIndex,
    private val loadSubraces: LoadSubraces
) {
    @Tool
    fun getSubraces(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadSubraces.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getSubrace(index: String) = loadSubraceByIndex.load(index)
}