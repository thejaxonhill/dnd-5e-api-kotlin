package com.thejaxonhill.dnd5eapi.race.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRace
import com.thejaxonhill.dnd5eapi.race.application.usecase.LoadRaces
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/races")
class RaceController(
    private val loadRace: LoadRace,
    private val loadRaces: LoadRaces
) {
    @GetMapping
    fun getRaces() = ResponseEntity.ok(loadRaces.load())

    @GetMapping("/{index}")
    fun getRace(@PathVariable index: String) = ResponseEntity.ok(loadRace.load(index))
}