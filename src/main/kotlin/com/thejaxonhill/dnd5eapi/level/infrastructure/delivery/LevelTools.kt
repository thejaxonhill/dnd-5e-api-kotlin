package com.thejaxonhill.dnd5eapi.level.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.level.application.usecase.LoadLevel
import com.thejaxonhill.dnd5eapi.level.application.usecase.LoadLevels
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class LevelTools(
    private val loadLevel: LoadLevel,
    private val loadLevels: LoadLevels
) {
    @Tool
    fun getLevels() = loadLevels.load()

    @Tool
    fun getLevel(index: String) = loadLevel.load(index)
}