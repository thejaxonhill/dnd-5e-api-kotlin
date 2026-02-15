package com.thejaxonhill.dnd5eapi.language.application.usecase

import com.thejaxonhill.dnd5eapi.language.domain.repository.LoadLanguagePort

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadLanguage(private val loadLanguagePort: LoadLanguagePort) {
    fun load(index: String) = loadLanguagePort.loadByIndex(index) ?: throw NoSuchElementException()
}