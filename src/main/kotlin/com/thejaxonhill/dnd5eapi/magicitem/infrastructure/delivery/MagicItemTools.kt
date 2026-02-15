package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItemByIndex
import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItems
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MagicItemTools(
    private val loadMagicItemByIndex: LoadMagicItemByIndex,
    private val loadMagicItems: LoadMagicItems
) {
    @Tool
    fun getMagicItems(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadMagicItems.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getMagicItem(index: String) = loadMagicItemByIndex.load(index)
}