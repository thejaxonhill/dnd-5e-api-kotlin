package com.thejaxonhill.dnd5eapi.monster.usecase

import com.thejaxonhill.dnd5eapi.monster.port.LoadMonsterPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadMonster(private val loadMonsterPort: LoadMonsterPort) {
    fun load(index: String) = loadMonsterPort.loadByIndex(index) ?: throw NotFoundException()
}