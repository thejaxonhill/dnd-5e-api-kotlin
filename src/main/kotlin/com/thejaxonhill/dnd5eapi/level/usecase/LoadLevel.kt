package com.thejaxonhill.dnd5eapi.level.usecase

import com.thejaxonhill.dnd5eapi.level.port.LoadLevelPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadLevel(private val loadLevelPort: LoadLevelPort) {
    fun load(index: String) = loadLevelPort.loadByIndex(index) ?: throw NotFoundException()
}