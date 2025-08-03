package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClasses
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class CharacterClassTools (
    private val loadCharacterClass: LoadCharacterClass,
    private val loadCharacterClasses: LoadCharacterClasses
) {
    @Tool
    fun getClasses() = loadCharacterClasses.load()

    @Tool
    fun getClass(index: String) = loadCharacterClass.load(index)
}