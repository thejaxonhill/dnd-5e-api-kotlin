package com.thejaxonhill.dnd5eapi.proficiency.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiencies
import com.thejaxonhill.dnd5eapi.proficiency.application.usecase.LoadProficiency
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/proficiencies")
class ProficiencyController(
    private val loadProficiency: LoadProficiency,
    private val loadProficiencies: LoadProficiencies
) {
    @GetMapping
    fun getProficiencies() = ResponseEntity.ok(loadProficiencies.load())

    @GetMapping("/{index}")
    fun getProficiency(@PathVariable index: String) = ResponseEntity.ok(loadProficiency.load(index))
}