package com.thejaxonhill.dnd5eapi.alignment.usecase

import com.thejaxonhill.dnd5eapi.alignment.port.LoadAlignmentPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadAlignment(private val loadAlignmentPort: LoadAlignmentPort) {
    fun load(index: String) = loadAlignmentPort.loadByIndex(index) ?: throw NotFoundException()
}