package com.thejaxonhill.dnd5eapi.level.delivery

import com.thejaxonhill.dnd5eapi.level.usecase.LoadLevel
import com.thejaxonhill.dnd5eapi.level.usecase.LoadLevels
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/levels")
class LevelController(
    private val loadLevel: LoadLevel,
    private val loadLevels: LoadLevels
) {
    @GetMapping
    fun getLevels() = ResponseEntity.ok(loadLevels.load())

    @GetMapping("/{index}")
    fun getLevel(@PathVariable index: String) = ResponseEntity.ok(loadLevel.load(index))
}