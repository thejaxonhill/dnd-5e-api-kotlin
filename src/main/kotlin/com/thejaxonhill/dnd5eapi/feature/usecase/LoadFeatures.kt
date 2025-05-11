package com.thejaxonhill.dnd5eapi.feature.usecase

import com.thejaxonhill.dnd5eapi.feature.port.LoadFeaturePort
import org.springframework.stereotype.Service

@Service
class LoadFeatures(private val loadFeaturePort: LoadFeaturePort) {
    fun load() = loadFeaturePort.loadAll()
}