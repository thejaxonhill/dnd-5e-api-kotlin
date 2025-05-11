package com.thejaxonhill.dnd5eapi.subrace.delivery

import com.thejaxonhill.dnd5eapi.subrace.usecase.LoadSubrace
import com.thejaxonhill.dnd5eapi.subrace.usecase.LoadSubraces
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/subraces")
class SubraceController(
    private val loadSubrace: LoadSubrace,
    private val loadSubraces: LoadSubraces
) {
    @GetMapping
    fun getSubraces() = ResponseEntity.ok(loadSubraces.load())

    @GetMapping("/{index}")
    fun getSubrace(@PathVariable index: String) = ResponseEntity.ok(loadSubrace.load(index))
}