package com.thejaxonhill.dnd5eapi.subrace.usecase

import com.thejaxonhill.dnd5eapi.subrace.port.LoadSubracePort
import org.springframework.stereotype.Service

@Service
class LoadSubraces(private val loadSubracePort: LoadSubracePort) {
    fun load() = loadSubracePort.loadAll()
}