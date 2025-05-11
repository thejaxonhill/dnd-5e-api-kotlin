package com.thejaxonhill.dnd5eapi.language.usecase

import com.thejaxonhill.dnd5eapi.language.port.LoadLanguagePort
import org.springframework.stereotype.Service

@Service
class LoadLanguages(private val loadLanguagePort: LoadLanguagePort) {
    fun load() = loadLanguagePort.loadAll()
}