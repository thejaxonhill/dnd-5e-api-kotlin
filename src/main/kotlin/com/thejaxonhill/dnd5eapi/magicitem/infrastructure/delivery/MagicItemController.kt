package com.thejaxonhill.dnd5eapi.magicitem.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItem
import com.thejaxonhill.dnd5eapi.magicitem.application.usecase.LoadMagicItems
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/magic-items")
class MagicItemController(
    private val loadMagicItem: LoadMagicItem,
    private val loadMagicItems: LoadMagicItems
) {
    @GetMapping
    fun getMagicItems() = ResponseEntity.ok(loadMagicItems.load())

    @GetMapping("/{index}")
    fun getMagicItem(@PathVariable index: String) = ResponseEntity.ok(loadMagicItem.load(index))
}