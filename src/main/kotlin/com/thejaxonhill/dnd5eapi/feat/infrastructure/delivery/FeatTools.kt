package com.thejaxonhill.dnd5eapi.feat.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeat
import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeats
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class FeatTools(
    private val loadFeat: LoadFeat,
    private val loadFeats: LoadFeats
) {
    @Tool
    fun getFeats() = loadFeats.load()

    @Tool
    fun getFeat(index: String) = loadFeat.load(index)
}