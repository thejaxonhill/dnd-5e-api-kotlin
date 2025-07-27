package com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.application.usecase.LoadAbilityScores
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ability-scores")
class AbilityScoreController(
    private val loadAbilityScore: LoadAbilityScore,
    private val loadAbilityScores: LoadAbilityScores
) {
    @GetMapping
    fun getAbilityScores() = ResponseEntity.ok(loadAbilityScores.load())

    @GetMapping("/{index}")
    fun getAbilityScore(@PathVariable index: String) = ResponseEntity.ok(loadAbilityScore.load(index))
}