package com.thejaxonhill.dnd5eapi.language.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.language.application.dto.LanguageView
import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguageByIndex
import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguages
import com.thejaxonhill.dnd5eapi.language.domain.model.LanguageExample
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

@Tag(name = "Languages")
@RestController
@RequestMapping("/api/languages")
class LanguageController(
    private val loadLanguageByIndex: LoadLanguageByIndex,
    private val loadLanguages: LoadLanguages
) {
    @Operation(summary = "Get a paginated list of languages")
    @GetMapping
    fun getLanguages(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: LanguageExample?
    ): ResponseEntity<PagedModel<LanguageView>> =
        ResponseEntity.ok(loadLanguages.load(pageable.toPage(), example))

    @Operation(summary = "Get a language by index")
    @GetMapping("/{index}")
    fun getLanguage(@PathVariable index: String): ResponseEntity<LanguageView> =
        ResponseEntity.ok(loadLanguageByIndex.load(index))
}