package com.thejaxonhill.dnd5eapi.subclass.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclass
import com.thejaxonhill.dnd5eapi.subclass.application.usecase.LoadSubclasses
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/subclasses")
class SubclassController(
    private val loadSubclass: LoadSubclass,
    private val loadSubclasses: LoadSubclasses
) {
    @GetMapping
    fun getSubclasses() = ResponseEntity.ok(loadSubclasses.load())

    @GetMapping("/{index}")
    fun getSubclass(@PathVariable index: String) = ResponseEntity.ok(loadSubclass.load(index))
}