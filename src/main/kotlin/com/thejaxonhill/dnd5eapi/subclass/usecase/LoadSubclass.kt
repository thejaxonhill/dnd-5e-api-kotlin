package com.thejaxonhill.dnd5eapi.subclass.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.subclass.port.LoadSubclassPort
import org.springframework.stereotype.Service

@Service
class LoadSubclass(private val loadSubclassPort: LoadSubclassPort) {
    fun load(index: String) = loadSubclassPort.loadByIndex(index) ?:
    throw NotFoundException()
}