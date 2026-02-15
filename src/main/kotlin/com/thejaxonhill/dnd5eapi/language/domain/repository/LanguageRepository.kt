package com.thejaxonhill.dnd5eapi.language.domain.repository

import com.thejaxonhill.dnd5eapi.language.domain.model.Language
import com.thejaxonhill.dnd5eapi.language.domain.model.LanguageExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface LanguageRepository {
    fun load(id: String): Language?
    fun loadByIndex(index: String): Language?
    fun loadAll(page: Page, example: LanguageExample? = null): PagedModel<Language>
    fun save(language: Language): Language
}
