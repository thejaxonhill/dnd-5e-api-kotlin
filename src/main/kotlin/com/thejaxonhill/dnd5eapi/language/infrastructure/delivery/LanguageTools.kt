package com.thejaxonhill.dnd5eapi.language.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguageByIndex
import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguages
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class LanguageTools(
    private val loadLanguageByIndex: LoadLanguageByIndex,
    private val loadLanguages: LoadLanguages
) {
    @Tool
    fun getLanguages(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadLanguages.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getLanguage(index: String) = loadLanguageByIndex.load(index)
}