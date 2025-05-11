package com.thejaxonhill.dnd5eapi.characterclass.delivery

import com.thejaxonhill.dnd5eapi.characterclass.usecase.LoadCharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.usecase.LoadCharacterClasses
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/classes")
class CharacterClassController(
    private val loadCharacterClass: LoadCharacterClass,
    private val loadCharacterClasses: LoadCharacterClasses
) {
    @GetMapping
    fun getClasses() = ResponseEntity.ok(loadCharacterClasses.load())

    @GetMapping("/{index}")
    fun getCharacterClass(@PathVariable index: String) = ResponseEntity.ok(loadCharacterClass.load(index))
}