package com.thejaxonhill.dnd5eapi.feat.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeatByIndex
import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeats
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class FeatTools(
    private val loadFeatByIndex: LoadFeatByIndex,
    private val loadFeats: LoadFeats
) {
    @Tool
    fun getFeats(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadFeats.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getFeat(index: String) = loadFeatByIndex.load(index)
}