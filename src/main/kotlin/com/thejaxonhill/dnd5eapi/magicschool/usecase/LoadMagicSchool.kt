package com.thejaxonhill.dnd5eapi.magicschool.usecase

import com.thejaxonhill.dnd5eapi.magicschool.port.LoadMagicSchoolPort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadMagicSchool(private val loadMagicSchoolPort: LoadMagicSchoolPort) {
    fun load(index: String) = loadMagicSchoolPort.loadByIndex(index) ?: throw NotFoundException()
}