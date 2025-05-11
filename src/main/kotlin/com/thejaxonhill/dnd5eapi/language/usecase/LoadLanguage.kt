package com.thejaxonhill.dnd5eapi.language.usecase

import com.thejaxonhill.dnd5eapi.language.port.LoadLanguagePort
import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class LoadLanguage(private val loadLanguagePort: LoadLanguagePort) {
    fun load(index: String) = loadLanguagePort.loadByIndex(index) ?: throw NotFoundException()
}