package com.thejaxonhill.dnd5eapi.feat.usecase

import com.thejaxonhill.dnd5eapi.feat.port.LoadFeatPort
import org.springframework.stereotype.Service

@Service
class LoadFeats(private val loadFeatPort: LoadFeatPort) {
    fun load() = loadFeatPort.loadAll()
}