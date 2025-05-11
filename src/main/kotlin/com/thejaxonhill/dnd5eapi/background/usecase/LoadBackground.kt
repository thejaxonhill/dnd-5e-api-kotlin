package com.thejaxonhill.dnd5eapi.background.usecase

import com.thejaxonhill.dnd5eapi.background.port.LoadBackgroundPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadBackground(private val loadBackgroundPort: LoadBackgroundPort) {
    fun load(index: String) = loadBackgroundPort.loadByIndex(index) ?: throw NotFoundException()
}