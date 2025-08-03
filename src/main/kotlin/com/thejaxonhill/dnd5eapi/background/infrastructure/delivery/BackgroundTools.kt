package com.thejaxonhill.dnd5eapi.background.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackground
import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgrounds
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class BackgroundTools(
    private val loadBackground: LoadBackground,
    private val loadBackgrounds: LoadBackgrounds
) {
    @Tool
    fun getBackgrounds() = loadBackgrounds.load()

    @Tool
    fun getBackground(index: String) = loadBackground.load(index)
}