package com.thejaxonhill.dnd5eapi.feat.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feat.application.dto.FeatView
import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeatByIndex
import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeats
import com.thejaxonhill.dnd5eapi.feat.domain.model.FeatExample
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

@Tag(name = "Feats")
@RestController
@RequestMapping("/api/feats")
class FeatController(
    private val loadFeatByIndex: LoadFeatByIndex,
    private val loadFeats: LoadFeats
) {
    @Operation(summary = "Get a paginated list of feats")
    @GetMapping
    fun getFeats(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: FeatExample?
    ): ResponseEntity<PagedModel<FeatView>> =
        ResponseEntity.ok(loadFeats.load(pageable.toPage(), example))

    @Operation(summary = "Get a feat by index")
    @GetMapping("/{index}")
    fun getFeat(@PathVariable index: String): ResponseEntity<FeatView> =
        ResponseEntity.ok(loadFeatByIndex.load(index))
}