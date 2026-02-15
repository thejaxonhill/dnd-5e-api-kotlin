package com.thejaxonhill.dnd5eapi.alignment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignmentByIndex
import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignments
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AlignmentGraphQlController(
    private val loadAlignmentByIndex: LoadAlignmentByIndex,
    private val loadAlignments: LoadAlignments
) {
    @QueryMapping
    fun getAlignments() = loadAlignments.load()

    @QueryMapping
    fun getAlignmentByIndex(@Argument index: String) = loadAlignmentByIndex.load(index)
}