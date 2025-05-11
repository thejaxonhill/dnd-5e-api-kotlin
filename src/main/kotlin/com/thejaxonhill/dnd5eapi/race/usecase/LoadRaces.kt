package com.thejaxonhill.dnd5eapi.race.usecase

import com.thejaxonhill.dnd5eapi.race.port.LoadRacePort
import org.springframework.stereotype.Service

@Service
class LoadRaces(private val loadRacePort: LoadRacePort) {
    fun load() = loadRacePort.loadAll()
}