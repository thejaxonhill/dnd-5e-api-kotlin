package com.thejaxonhill.dnd5eapi.monster.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonster
import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsters
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/monsters")
class MonsterController(
    private val loadMonster: LoadMonster,
    private val loadMonsters: LoadMonsters
) {
    @GetMapping
    fun getMonsters() = ResponseEntity.ok(loadMonsters.load())

    @GetMapping("/{index}")
    fun getMonster(@PathVariable index: String) = ResponseEntity.ok(loadMonster.load(index))
}