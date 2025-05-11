package com.thejaxonhill.dnd5eapi.trait.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.trait.port.LoadTraitPort
import org.springframework.stereotype.Service

@Service
class LoadTrait(private val loadTraitPort: LoadTraitPort) {
    fun load(index: String) = loadTraitPort.loadByIndex(index) ?:
    throw NotFoundException()
}