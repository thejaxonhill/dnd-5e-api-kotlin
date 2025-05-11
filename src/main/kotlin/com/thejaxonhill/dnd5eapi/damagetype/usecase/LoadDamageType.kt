package com.thejaxonhill.dnd5eapi.damagetype.usecase

import com.thejaxonhill.dnd5eapi.damagetype.port.LoadDamageTypePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadDamageType(private val loadDamageTypePort: LoadDamageTypePort) {
    fun load(index: String) = loadDamageTypePort.loadByIndex(index) ?: throw NotFoundException()
}