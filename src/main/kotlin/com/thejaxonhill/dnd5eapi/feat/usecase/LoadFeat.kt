package com.thejaxonhill.dnd5eapi.feat.usecase

import com.thejaxonhill.dnd5eapi.feat.port.LoadFeatPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadFeat(private val loadFeatPort: LoadFeatPort) {
    fun load(index: String) = loadFeatPort.loadByIndex(index) ?: throw NotFoundException()
}