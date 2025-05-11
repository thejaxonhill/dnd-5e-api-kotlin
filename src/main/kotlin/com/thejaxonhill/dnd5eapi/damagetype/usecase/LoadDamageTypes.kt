package com.thejaxonhill.dnd5eapi.damagetype.usecase

import com.thejaxonhill.dnd5eapi.damagetype.port.LoadDamageTypePort
import org.springframework.stereotype.Service

@Service
class LoadDamageTypes(private val loadDamageTypePort: LoadDamageTypePort) {
    fun load() = loadDamageTypePort.loadAll()
}