package com.thejaxonhill.dnd5eapi.trait.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.trait.application.usecase.LoadTrait
import com.thejaxonhill.dnd5eapi.trait.application.usecase.LoadTraits
import org.springframework.ai.tool.annotation.Tool

@McpTools
class TraitTools(
    private val loadTrait: LoadTrait,
    private val loadTraits: LoadTraits
) {
    @Tool
    fun getTraits() = loadTraits.load()

    @Tool
    fun getTrait(index: String) = loadTrait.load(index)
}