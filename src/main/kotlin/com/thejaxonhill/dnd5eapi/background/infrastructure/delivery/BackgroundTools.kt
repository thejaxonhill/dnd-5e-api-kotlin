package com.thejaxonhill.dnd5eapi.background.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgroundByIndex
import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgrounds
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class BackgroundTools(
    private val loadBackgroundByIndex: LoadBackgroundByIndex,
    private val loadBackgrounds: LoadBackgrounds
) {
    @Tool
    fun getBackgrounds(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadBackgrounds.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getBackground(index: String) = loadBackgroundByIndex.load(index)
}