package com.thejaxonhill.dnd5eapi.subclass.usecase

import com.thejaxonhill.dnd5eapi.subclass.port.LoadSubclassPort
import org.springframework.stereotype.Service

@Service
class LoadSubclasses(private val loadSubclassPort: LoadSubclassPort) {
    fun load() = loadSubclassPort.loadAll()
}