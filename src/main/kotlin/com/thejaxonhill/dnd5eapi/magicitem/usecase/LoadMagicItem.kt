package com.thejaxonhill.dnd5eapi.magicitem.usecase

import com.thejaxonhill.dnd5eapi.magicitem.port.LoadMagicItemPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadMagicItem(private val loadMagicItemPort: LoadMagicItemPort) {
    fun load(index: String) = loadMagicItemPort.loadByIndex(index) ?: throw NotFoundException()
}