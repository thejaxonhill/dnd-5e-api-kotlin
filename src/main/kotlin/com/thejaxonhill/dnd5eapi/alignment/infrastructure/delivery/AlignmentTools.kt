package com.thejaxonhill.dnd5eapi.alignment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignmentByIndex
import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignments
import com.thejaxonhill.dnd5eapi.alignment.domain.AlignmentExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class AlignmentTools(
    private val loadAlignmentByIndex: LoadAlignmentByIndex,
    private val loadAlignments: LoadAlignments
) {
    @Tool
    fun getAlignments(page: Page, example: AlignmentExample?) = loadAlignments.load(page, example)

    @Tool
    fun getAlignment(index: String) = loadAlignmentByIndex.load(index)
}