package com.thejaxonhill.dnd5eapi.subrace.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubrace
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubraces
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SubraceTools(
    private val loadSubrace: LoadSubrace,
    private val loadSubraces: LoadSubraces
) {
    @Tool
    fun getSubraces() = loadSubraces.load()

    @Tool
    fun getSubrace(index: String) = loadSubrace.load(index)
}