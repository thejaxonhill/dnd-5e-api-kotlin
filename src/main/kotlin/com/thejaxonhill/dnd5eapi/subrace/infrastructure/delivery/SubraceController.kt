package com.thejaxonhill.dnd5eapi.subrace.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import com.thejaxonhill.dnd5eapi.subrace.application.dto.SubraceView
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubraceByIndex
import com.thejaxonhill.dnd5eapi.subrace.application.usecase.LoadSubraces
import com.thejaxonhill.dnd5eapi.subrace.domain.model.SubraceExample
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Subraces")
@RestController
@RequestMapping("/api/subraces")
class SubraceController(
    private val loadSubraceByIndex: LoadSubraceByIndex,
    private val loadSubraces: LoadSubraces
) {
    @Operation(summary = "Get a paginated list of subraces")
    @GetMapping
    fun getSubraces(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: SubraceExample?
    ): ResponseEntity<PagedModel<SubraceView>> =
        ResponseEntity.ok(loadSubraces.load(pageable.toPage(), example))

    @Operation(summary = "Get a subrace by index")
    @GetMapping("/{index}")
    fun getSubrace(@PathVariable index: String): ResponseEntity<SubraceView> =
        ResponseEntity.ok(loadSubraceByIndex.load(index))
}