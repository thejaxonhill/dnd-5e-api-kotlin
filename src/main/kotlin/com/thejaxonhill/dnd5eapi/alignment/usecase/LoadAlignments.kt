package com.thejaxonhill.dnd5eapi.alignment.usecase

import com.thejaxonhill.dnd5eapi.alignment.port.LoadAlignmentPort
import org.springframework.stereotype.Service

@Service
class LoadAlignments(private val loadAlignmentPort: LoadAlignmentPort) {
    fun load() = loadAlignmentPort.loadAll()
}