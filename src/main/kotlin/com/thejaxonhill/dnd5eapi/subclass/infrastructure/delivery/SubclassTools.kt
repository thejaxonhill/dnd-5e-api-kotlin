package com.thejaxonhill.dnd5eapi.subclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclass
import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclasses
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SubclassTools(
    private val loadSubclass: LoadSubclass,
    private val loadSubclasses: LoadSubclasses
) {
    @Tool
    fun getSubclasses() = loadSubclasses.load()

    @Tool
    fun getSubclass(index: String) = loadSubclass.load(index)
}