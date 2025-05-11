package com.thejaxonhill.dnd5eapi.trait.usecase

import com.thejaxonhill.dnd5eapi.trait.port.LoadTraitPort
import org.springframework.stereotype.Service

@Service
class LoadTraits(private val loadTraitPort: LoadTraitPort) {
    fun load() = loadTraitPort.loadAll()
}