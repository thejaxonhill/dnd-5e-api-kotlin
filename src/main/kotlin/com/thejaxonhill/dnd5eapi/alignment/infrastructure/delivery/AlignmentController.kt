package com.thejaxonhill.dnd5eapi.alignment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignment
import com.thejaxonhill.dnd5eapi.alignment.application.usecase.LoadAlignments
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/alignments")
class AlignmentController(
    private val loadAlignment: LoadAlignment,
    private val loadAlignments: LoadAlignments
) {
    @GetMapping
    fun getAlignments() = ResponseEntity.ok(loadAlignments.load())

    @GetMapping("/{index}")
    fun getAlignment(@PathVariable index: String) = ResponseEntity.ok(loadAlignment.load(index))
}