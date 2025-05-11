package com.thejaxonhill.dnd5eapi.background.usecase

import com.thejaxonhill.dnd5eapi.background.port.LoadBackgroundPort
import org.springframework.stereotype.Service

@Service
class LoadBackgrounds(private val loadBackgroundPort: LoadBackgroundPort) {
    fun load() = loadBackgroundPort.loadAll()
}