package com.thejaxonhill.dnd5eapi.spell.usecase

import com.thejaxonhill.dnd5eapi.spell.port.LoadSpellPort
import org.springframework.stereotype.Service

@Service
class LoadSpells(private val loadSpellPort: LoadSpellPort) {
    fun load() = loadSpellPort.loadAll()
}