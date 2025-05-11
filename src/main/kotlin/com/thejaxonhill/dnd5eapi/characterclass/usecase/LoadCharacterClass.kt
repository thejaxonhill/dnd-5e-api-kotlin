package com.thejaxonhill.dnd5eapi.characterclass.usecase

import com.thejaxonhill.dnd5eapi.characterclass.port.LoadCharacterClassPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadCharacterClass(private val loadCharacterClassPort: LoadCharacterClassPort) {
    fun load(index: String) = loadCharacterClassPort.loadByIndex(index) ?: throw NotFoundException()
}