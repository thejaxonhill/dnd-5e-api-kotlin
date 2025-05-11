package com.thejaxonhill.dnd5eapi.trait.delivery

import com.thejaxonhill.dnd5eapi.trait.usecase.LoadTrait
import com.thejaxonhill.dnd5eapi.trait.usecase.LoadTraits
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/traits")
class TraitController(
    private val loadTrait: LoadTrait,
    private val loadTraits: LoadTraits
) {
    @GetMapping
    fun getTraits() = ResponseEntity.ok(loadTraits.load())

    @GetMapping("/{index}")
    fun getTrait(@PathVariable index: String) = ResponseEntity.ok(loadTrait.load(index))
}