package com.thejaxonhill.dnd5eapi.spell.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.spell.port.LoadSpellPort
import org.springframework.stereotype.Service

@Service
class LoadSpell(private val loadSpellPort: LoadSpellPort) {
    fun load(index: String) = loadSpellPort.loadByIndex(index) ?:
    throw NotFoundException()
}