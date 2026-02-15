package com.thejaxonhill.dnd5eapi.subclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclassByIndex
import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclasses
import org.springframework.ai.tool.annotation.Tool

@McpTools
class SubclassTools(
    private val loadSubclassByIndex: LoadSubclassByIndex,
    private val loadSubclasses: LoadSubclasses
) {
    @Tool
    fun getSubclasses(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadSubclasses.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getSubclass(index: String) = loadSubclassByIndex.load(index)
}