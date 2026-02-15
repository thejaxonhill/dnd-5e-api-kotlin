package com.thejaxonhill.dnd5eapi.language.application.usecase

import com.thejaxonhill.dnd5eapi.language.application.dto.toView
import com.thejaxonhill.dnd5eapi.language.domain.model.LanguageExample
import com.thejaxonhill.dnd5eapi.language.domain.repository.LanguageRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadLanguages(private val languageRepository: LanguageRepository) {
    fun load(page: Page, example: LanguageExample?) =
        languageRepository.loadAll(page, example).map { it.toView() }
}