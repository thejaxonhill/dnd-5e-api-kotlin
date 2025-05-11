package com.thejaxonhill.dnd5eapi.magicitem.usecase

import com.thejaxonhill.dnd5eapi.magicitem.port.LoadMagicItemPort
import org.springframework.stereotype.Service

@Service
class LoadMagicItems(private val loadMagicItemPort: LoadMagicItemPort) {
    fun load() = loadMagicItemPort.loadAll()
}