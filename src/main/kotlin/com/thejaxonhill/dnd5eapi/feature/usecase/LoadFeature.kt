package com.thejaxonhill.dnd5eapi.feature.usecase

import com.thejaxonhill.dnd5eapi.feature.port.LoadFeaturePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadFeature(private val loadFeaturePort: LoadFeaturePort) {
    fun load(index: String) = loadFeaturePort.loadByIndex(index) ?: throw NotFoundException()
}