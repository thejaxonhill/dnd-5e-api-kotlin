package com.thejaxonhill.dnd5eapi.language.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguage
import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguages
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class LanguageTools(
    private val loadLanguage: LoadLanguage,
    private val loadLanguages: LoadLanguages
) {
    @Tool
    fun getLanguages() = loadLanguages.load()

    @Tool
    fun getLanguage(index: String) = loadLanguage.load(index)
}