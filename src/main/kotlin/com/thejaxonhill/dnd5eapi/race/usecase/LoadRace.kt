package com.thejaxonhill.dnd5eapi.race.usecase

import com.thejaxonhill.dnd5eapi.race.port.LoadRacePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadRace(private val loadRacePort: LoadRacePort) {
    fun load(index: String) = loadRacePort.loadByIndex(index) ?: throw NotFoundException()
}