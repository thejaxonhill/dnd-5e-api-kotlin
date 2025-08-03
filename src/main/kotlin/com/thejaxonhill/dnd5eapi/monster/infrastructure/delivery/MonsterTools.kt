package com.thejaxonhill.dnd5eapi.monster.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonster
import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsters
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MonsterTools(
    private val loadMonster: LoadMonster,
    private val loadMonsters: LoadMonsters
) {
    @Tool
    fun getMonsters() = loadMonsters.load()

    @Tool
    fun getMonster(index: String) = loadMonster.load(index)
}