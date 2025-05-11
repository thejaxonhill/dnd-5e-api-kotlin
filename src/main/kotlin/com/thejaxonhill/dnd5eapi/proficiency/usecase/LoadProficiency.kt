package com.thejaxonhill.dnd5eapi.proficiency.usecase

import com.thejaxonhill.dnd5eapi.proficiency.port.LoadProficiencyPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadProficiency(private val loadProficiencyPort: LoadProficiencyPort) {
    fun load(index: String) = loadProficiencyPort.loadByIndex(index) ?: throw NotFoundException()
}