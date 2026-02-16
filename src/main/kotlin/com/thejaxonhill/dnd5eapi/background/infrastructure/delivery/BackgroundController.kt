package com.thejaxonhill.dnd5eapi.background.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.background.application.dto.BackgroundView
import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgroundByIndex
import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgrounds
import com.thejaxonhill.dnd5eapi.background.domain.BackgroundExample
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

@Tag(name = "Backgrounds")
@RestController
@RequestMapping("/api/backgrounds")
class BackgroundController(
    private val loadBackgroundByIndex: LoadBackgroundByIndex,
    private val loadBackgrounds: LoadBackgrounds
) {
    @Operation(summary = "Get a paginated list of backgrounds")
    @GetMapping
    fun getBackgrounds(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: BackgroundExample?
    ): ResponseEntity<PagedModel<BackgroundView>> =
        ResponseEntity.ok(loadBackgrounds.load(pageable.toPage(), example))

    @Operation(summary = "Get a background by index")
    @GetMapping("/{index}")
    fun getBackground(@PathVariable index: String): ResponseEntity<BackgroundView> =
        ResponseEntity.ok(loadBackgroundByIndex.load(index))
}