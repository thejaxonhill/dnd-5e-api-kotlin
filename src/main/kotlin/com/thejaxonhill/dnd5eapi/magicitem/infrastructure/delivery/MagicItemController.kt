package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicitem.application.dto.MagicItemView
import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItemByIndex
import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItems
import com.thejaxonhill.dnd5eapi.magicitem.domain.MagicItemExample
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

@Tag(name = "Magic Items")
@RestController
@RequestMapping("/api/magic-items")
class MagicItemController(
    private val loadMagicItemByIndex: LoadMagicItemByIndex,
    private val loadMagicItems: LoadMagicItems
) {
    @Operation(summary = "Get a paginated list of magic items")
    @GetMapping
    fun getMagicItems(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: MagicItemExample?
    ): ResponseEntity<PagedModel<MagicItemView>> =
        ResponseEntity.ok(loadMagicItems.load(pageable.toPage(), example))

    @Operation(summary = "Get a magic item by index")
    @GetMapping("/{index}")
    fun getMagicItem(@PathVariable index: String): ResponseEntity<MagicItemView> =
        ResponseEntity.ok(loadMagicItemByIndex.load(index))
}