package com.thejaxonhill.dnd5eapi.background.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackground
import com.thejaxonhill.dnd5eapi.background.application.usecase.LoadBackgrounds
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/backgrounds")
class BackgroundController(
    private val loadBackground: LoadBackground,
    private val loadBackgrounds: LoadBackgrounds
) {
    @GetMapping
    fun getBackgrounds() = ResponseEntity.ok(loadBackgrounds.load())

    @GetMapping("/{index}")
    fun getBackground(@PathVariable index: String) = ResponseEntity.ok(loadBackground.load(index))
}