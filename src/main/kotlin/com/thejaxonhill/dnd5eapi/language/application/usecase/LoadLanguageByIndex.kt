package com.thejaxonhill.dnd5eapi.language.application.usecase

import com.thejaxonhill.dnd5eapi.language.application.dto.toView
import com.thejaxonhill.dnd5eapi.language.domain.LanguageRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadLanguageByIndex(private val languageRepository: LanguageRepository) {
    fun load(index: String) = languageRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}