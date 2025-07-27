package com.thejaxonhill.dnd5eapi.spell.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpell
import com.thejaxonhill.dnd5eapi.spell.application.usecase.LoadSpells
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/spells")
class SpellController(
    private val loadSpell: LoadSpell,
    private val loadSpells: LoadSpells
) {
    @GetMapping
    fun getSpells() = ResponseEntity.ok(loadSpells.load())

    @GetMapping("/{index}")
    fun getSpell(@PathVariable index: String) = ResponseEntity.ok(loadSpell.load(index))
}