package com.thejaxonhill.dnd5eapi.monster.usecase

import com.thejaxonhill.dnd5eapi.monster.port.LoadMonsterPort
import org.springframework.stereotype.Service

@Service
class LoadMonsters(private val loadMonsterPort: LoadMonsterPort) {
    fun load() = loadMonsterPort.loadAll()
}