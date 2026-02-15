package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClassByIndex
import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClasses
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class CharacterClassTools(
    private val loadCharacterClassByIndex: LoadCharacterClassByIndex,
    private val loadCharacterClasses: LoadCharacterClasses
) {
    @Tool
    fun getClasses(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadCharacterClasses.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getCharacterClass(index: String) = loadCharacterClassByIndex.load(index)
}