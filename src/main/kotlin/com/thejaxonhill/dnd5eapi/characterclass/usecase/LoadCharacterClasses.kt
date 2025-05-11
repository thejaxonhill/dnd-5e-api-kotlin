package com.thejaxonhill.dnd5eapi.characterclass.usecase

import com.thejaxonhill.dnd5eapi.characterclass.port.LoadCharacterClassPort
import org.springframework.stereotype.Service

@Service
class LoadCharacterClasses(private val loadCharacterClassPort: LoadCharacterClassPort) {
    fun load() = loadCharacterClassPort.loadAll()
}