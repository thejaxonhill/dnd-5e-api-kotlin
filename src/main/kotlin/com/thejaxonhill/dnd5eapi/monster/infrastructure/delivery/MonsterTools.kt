package com.thejaxonhill.dnd5eapi.monster.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsterByIndex
import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsters
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MonsterTools(
    private val loadMonsterByIndex: LoadMonsterByIndex,
    private val loadMonsters: LoadMonsters
) {
    @Tool
    fun getMonsters(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadMonsters.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getMonster(index: String) = loadMonsterByIndex.load(index)
}