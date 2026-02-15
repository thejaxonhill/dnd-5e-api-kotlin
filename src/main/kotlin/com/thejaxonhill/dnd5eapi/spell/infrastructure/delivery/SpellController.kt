package com.thejaxonhill.dnd5eapi.spell.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import com.thejaxonhill.dnd5eapi.spell.application.dto.SpellView
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpellByIndex
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpells
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellExample
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Spells")
@RestController
@RequestMapping("/api/spells")
class SpellController(
    private val loadSpellByIndex: LoadSpellByIndex,
    private val loadSpells: LoadSpells
) {
    @Operation(summary = "Get a paginated list of spells")
    @GetMapping
    fun getSpells(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: SpellExample?
    ): ResponseEntity<PagedModel<SpellView>> =
        ResponseEntity.ok(loadSpells.load(pageable.toPage(), example))

    @Operation(summary = "Get a spell by index")
    @GetMapping("/{index}")
    fun getSpell(@PathVariable index: String): ResponseEntity<SpellView> =
        ResponseEntity.ok(loadSpellByIndex.load(index))
}