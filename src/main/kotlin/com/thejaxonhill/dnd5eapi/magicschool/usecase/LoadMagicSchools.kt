package com.thejaxonhill.dnd5eapi.magicschool.usecase

import com.thejaxonhill.dnd5eapi.magicschool.port.LoadMagicSchoolPort
import org.springframework.stereotype.Service

@Service
class LoadMagicSchools(private val loadMagicSchoolPort: LoadMagicSchoolPort) {
    fun load() = loadMagicSchoolPort.loadAll()
}