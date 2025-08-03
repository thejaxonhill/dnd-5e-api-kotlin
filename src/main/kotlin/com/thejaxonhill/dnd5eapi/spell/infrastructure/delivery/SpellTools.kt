package com.thejaxonhill.dnd5eapi.spell.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpell
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpells
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SpellTools(
    private val loadSpell: LoadSpell,
    private val loadSpells: LoadSpells
) {
    @Tool
    fun getSpells() = loadSpells.load()

    @Tool
    fun getSpell(index: String) = loadSpell.load(index)
}