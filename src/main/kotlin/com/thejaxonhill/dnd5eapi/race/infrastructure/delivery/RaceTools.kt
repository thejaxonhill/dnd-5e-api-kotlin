package com.thejaxonhill.dnd5eapi.race.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRaceByIndex
import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRaces
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RaceTools(
    private val loadRaceByIndex: LoadRaceByIndex,
    private val loadRaces: LoadRaces
) {
    @Tool
    fun getRaces(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadRaces.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getRace(index: String) = loadRaceByIndex.load(index)
}