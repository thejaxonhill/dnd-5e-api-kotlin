package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.characterclass.application.dto.CharacterClassView
import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClassByIndex
import com.thejaxonhill.dnd5eapi.characterclass.application.usecase.LoadCharacterClasses
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClassExample
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

@Tag(name = "Character Classes")
@RestController
@RequestMapping("/api/classes")
class CharacterClassController(
    private val loadCharacterClassByIndex: LoadCharacterClassByIndex,
    private val loadCharacterClasses: LoadCharacterClasses
) {
    @Operation(summary = "Get a paginated list of character classes")
    @GetMapping
    fun getClasses(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: CharacterClassExample?
    ): ResponseEntity<PagedModel<CharacterClassView>> =
        ResponseEntity.ok(loadCharacterClasses.load(pageable.toPage(), example))

    @Operation(summary = "Get a character class by index")
    @GetMapping("/{index}")
    fun getCharacterClass(@PathVariable index: String): ResponseEntity<CharacterClassView> =
        ResponseEntity.ok(loadCharacterClassByIndex.load(index))
}