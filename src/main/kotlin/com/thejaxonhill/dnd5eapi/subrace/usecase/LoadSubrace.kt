package com.thejaxonhill.dnd5eapi.subrace.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.subrace.port.LoadSubracePort
import org.springframework.stereotype.Service

@Service
class LoadSubrace(private val loadSubracePort: LoadSubracePort) {
    fun load(index: String) = loadSubracePort.loadByIndex(index) ?:
    throw NotFoundException()
}