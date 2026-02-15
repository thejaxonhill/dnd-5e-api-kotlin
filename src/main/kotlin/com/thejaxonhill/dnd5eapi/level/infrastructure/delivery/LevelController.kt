package com.thejaxonhill.dnd5eapi.level.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.level.application.dto.LevelView
import com.thejaxonhill.dnd5eapi.level.application.usecase.LoadLevelByIndex
import com.thejaxonhill.dnd5eapi.level.application.usecase.LoadLevels
import com.thejaxonhill.dnd5eapi.level.domain.model.LevelExample
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

@Tag(name = "Levels")
@RestController
@RequestMapping("/api/levels")
class LevelController(
    private val loadLevelByIndex: LoadLevelByIndex,
    private val loadLevels: LoadLevels
) {
    @Operation(summary = "Get a paginated list of levels")
    @GetMapping
    fun getLevels(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: LevelExample?
    ): ResponseEntity<PagedModel<LevelView>> =
        ResponseEntity.ok(loadLevels.load(pageable.toPage(), example))

    @Operation(summary = "Get a level by index")
    @GetMapping("/{index}")
    fun getLevel(@PathVariable index: String): ResponseEntity<LevelView> =
        ResponseEntity.ok(loadLevelByIndex.load(index))
}