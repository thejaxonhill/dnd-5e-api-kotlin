package com.thejaxonhill.dnd5eapi.feature.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeature
import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatures
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class FeatureTools(
    private val loadFeature: LoadFeature,
    private val loadFeatures: LoadFeatures
) {
    @Tool
    fun getFeatures() = loadFeatures.load()

    @Tool
    fun getFeature(index: String) = loadFeature.load(index)
}