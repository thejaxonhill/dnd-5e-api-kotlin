package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.rulesection.application.dto.RuleSectionView
import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSectionByIndex
import com.thejaxonhill.dnd5eapi.rulesection.application.usecase.LoadRuleSections
import com.thejaxonhill.dnd5eapi.rulesection.domain.RuleSectionExample
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

@Tag(name = "Rule Sections")
@RestController
@RequestMapping("/api/rule-sections")
class RuleSectionController(
    private val loadRuleSectionByIndex: LoadRuleSectionByIndex,
    private val loadRuleSections: LoadRuleSections
) {
    @Operation(summary = "Get a paginated list of rule sections")
    @GetMapping
    fun getRuleSections(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: RuleSectionExample?
    ): ResponseEntity<PagedModel<RuleSectionView>> =
        ResponseEntity.ok(loadRuleSections.load(pageable.toPage(), example))

    @Operation(summary = "Get a rule section by index")
    @GetMapping("/{index}")
    fun getRuleSection(@PathVariable index: String): ResponseEntity<RuleSectionView> =
        ResponseEntity.ok(loadRuleSectionByIndex.load(index))
}