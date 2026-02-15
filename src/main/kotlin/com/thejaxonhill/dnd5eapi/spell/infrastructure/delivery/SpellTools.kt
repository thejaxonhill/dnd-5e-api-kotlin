package com.thejaxonhill.dnd5eapi.spell.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpellByIndex
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpells
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SpellTools(
    private val loadSpellByIndex: LoadSpellByIndex,
    private val loadSpells: LoadSpells
) {
    @Tool
    fun getSpells(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadSpells.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getSpell(index: String) = loadSpellByIndex.load(index)
}