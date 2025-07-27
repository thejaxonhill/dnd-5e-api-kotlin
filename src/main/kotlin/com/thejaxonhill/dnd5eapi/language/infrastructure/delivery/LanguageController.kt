package com.thejaxonhill.dnd5eapi.language.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguage
import com.thejaxonhill.dnd5eapi.language.application.usecase.LoadLanguages
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/languages")
class LanguageController(
    private val loadLanguage: LoadLanguage,
    private val loadLanguages: LoadLanguages
) {
    @GetMapping
    fun getLanguages() = ResponseEntity.ok(loadLanguages.load())

    @GetMapping("/{index}")
    fun getLanguage(@PathVariable index: String) = ResponseEntity.ok(loadLanguage.load(index))
}