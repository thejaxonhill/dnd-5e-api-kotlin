package com.thejaxonhill.dnd5eapi.magicschool.delivery

import com.thejaxonhill.dnd5eapi.magicschool.usecase.LoadMagicSchool
import com.thejaxonhill.dnd5eapi.magicschool.usecase.LoadMagicSchools
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/magic-schools")
class MagicSchoolController(
    private val loadMagicSchool: LoadMagicSchool,
    private val loadMagicSchools: LoadMagicSchools
) {
    @GetMapping
    fun getMagicSchools() = ResponseEntity.ok(loadMagicSchools.load())

    @GetMapping("/{index}")
    fun getMagicSchool(@PathVariable index: String) = ResponseEntity.ok(loadMagicSchool.load(index))
}