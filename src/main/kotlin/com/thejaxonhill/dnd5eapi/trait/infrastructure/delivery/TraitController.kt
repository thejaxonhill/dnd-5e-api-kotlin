package com.thejaxonhill.dnd5eapi.trait.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import com.thejaxonhill.dnd5eapi.trait.application.dto.TraitView
import com.thejaxonhill.dnd5eapi.trait.application.usecase.LoadTraitByIndex
import com.thejaxonhill.dnd5eapi.trait.application.usecase.LoadTraits
import com.thejaxonhill.dnd5eapi.trait.domain.TraitExample
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Traits")
@RestController
@RequestMapping("/api/traits")
class TraitController(
    private val loadTraitByIndex: LoadTraitByIndex,
    private val loadTraits: LoadTraits
) {
    @Operation(summary = "Get a paginated list of traits")
    @GetMapping
    fun getTraits(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: TraitExample?
    ): ResponseEntity<PagedModel<TraitView>> =
        ResponseEntity.ok(loadTraits.load(pageable.toPage(), example))

    @Operation(summary = "Get a trait by index")
    @GetMapping("/{index}")
    fun getTrait(@PathVariable index: String): ResponseEntity<TraitView> =
        ResponseEntity.ok(loadTraitByIndex.load(index))
}