package com.thejaxonhill.dnd5eapi.level.usecase

import com.thejaxonhill.dnd5eapi.level.port.LoadLevelPort
import org.springframework.stereotype.Service

@Service
class LoadLevels(private val loadLevelPort: LoadLevelPort) {
    fun load() = loadLevelPort.loadAll()
}