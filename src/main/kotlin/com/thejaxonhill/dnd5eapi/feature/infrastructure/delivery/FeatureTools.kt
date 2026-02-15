package com.thejaxonhill.dnd5eapi.feature.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatureByIndex
import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatures
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class FeatureTools(
    private val loadFeatureByIndex: LoadFeatureByIndex,
    private val loadFeatures: LoadFeatures
) {
    @Tool
    fun getFeatures(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadFeatures.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getFeature(index: String) = loadFeatureByIndex.load(index)
}