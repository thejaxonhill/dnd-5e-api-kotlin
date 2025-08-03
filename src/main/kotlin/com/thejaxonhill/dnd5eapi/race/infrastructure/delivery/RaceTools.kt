package com.thejaxonhill.dnd5eapi.race.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRace
import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRaces
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class RaceTools(
    private val loadRace: LoadRace,
    private val loadRaces: LoadRaces
) {
    @Tool
    fun getRaces() = loadRaces.load()

    @Tool
    fun getRace(index: String) = loadRace.load(index)
}