package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.proficiency.application.dto.ProficiencyView
import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencyByIndex
import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencies
import com.thejaxonhill.dnd5eapi.proficiency.domain.ProficiencyExample
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

@Tag(name = "Proficiencies")
@RestController
@RequestMapping("/api/proficiencies")
class ProficiencyController(
    private val loadProficiencyByIndex: LoadProficiencyByIndex,
    private val loadProficiencies: LoadProficiencies
) {
    @Operation(summary = "Get a paginated list of proficiencies")
    @GetMapping
    fun getProficiencies(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: ProficiencyExample?
    ): ResponseEntity<PagedModel<ProficiencyView>> =
        ResponseEntity.ok(loadProficiencies.load(pageable.toPage(), example))

    @Operation(summary = "Get a proficiency by index")
    @GetMapping("/{index}")
    fun getProficiency(@PathVariable index: String): ResponseEntity<ProficiencyView> =
        ResponseEntity.ok(loadProficiencyByIndex.load(index))
}