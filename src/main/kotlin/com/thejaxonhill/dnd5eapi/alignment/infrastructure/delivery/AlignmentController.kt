package com.thejaxonhill.dnd5eapi.alignment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.alignment.application.dto.AlignmentView
import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignmentByIndex
import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignments
import com.thejaxonhill.dnd5eapi.alignment.domain.model.AlignmentExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Alignments")
@RestController
@RequestMapping("/api/alignments")
class AlignmentController(
    private val loadAlignmentByIndex: LoadAlignmentByIndex,
    private val loadAlignments: LoadAlignments
) {
    @Operation(summary = "Get a paginated list of alignments")
    @GetMapping
    fun getAlignments(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: AlignmentExample?
    ): ResponseEntity<PagedModel<AlignmentView>> =
        ResponseEntity.ok(loadAlignments.load(pageable.toPage(), example))

    @Operation(summary = "Get an alignment by index")
    @GetMapping("/{index}")
    fun getAlignment(@PathVariable index: String): ResponseEntity<AlignmentView> =
        ResponseEntity.ok(loadAlignmentByIndex.load(index))
}