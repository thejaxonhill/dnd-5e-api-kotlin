package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.application.dto.AbilityScoreView
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScoreByIndex
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScores
import com.thejaxonhill.dnd5eapi.abilityscore.domain.AbilityScoreExample
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

@Tag(name = "Ability Scores")
@RestController
@RequestMapping("/api/ability-scores")
class AbilityScoreController(
    private val loadAbilityScoreByIndex: LoadAbilityScoreByIndex,
    private val loadAbilityScores: LoadAbilityScores
) {
    @Operation(summary = "Get a paginated list of ability scores")
    @GetMapping
    fun getAbilityScores(
        @ParameterObject page: Pageable,
        @ParameterObject example: AbilityScoreExample
    ): ResponseEntity<PagedModel<AbilityScoreView>> =
        ResponseEntity.ok(loadAbilityScores.load(page.toPage(), example))

    @Operation(summary = "Get an ability score by index")
    @GetMapping("/{index}")
    fun getAbilityScore(@PathVariable index: String): ResponseEntity<AbilityScoreView> =
        ResponseEntity.ok(loadAbilityScoreByIndex.load(index))
}