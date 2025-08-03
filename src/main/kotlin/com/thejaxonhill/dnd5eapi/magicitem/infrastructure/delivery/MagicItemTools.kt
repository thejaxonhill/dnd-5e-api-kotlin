package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItem
import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItems
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MagicItemTools(
    private val loadMagicItem: LoadMagicItem,
    private val loadMagicItems: LoadMagicItems
) {
    @Tool
    fun getMagicItems() = loadMagicItems.load()

    @Tool
    fun getMagicItem(index: String) = loadMagicItem.load(index)
}