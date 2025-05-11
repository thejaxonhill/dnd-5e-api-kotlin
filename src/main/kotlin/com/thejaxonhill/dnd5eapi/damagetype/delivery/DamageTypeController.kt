package com.thejaxonhill.dnd5eapi.damagetype.delivery

import com.thejaxonhill.dnd5eapi.damagetype.usecase.LoadDamageType
import com.thejaxonhill.dnd5eapi.damagetype.usecase.LoadDamageTypes
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/damage-types")
class DamageTypeController(
    private val loadDamageType: LoadDamageType,
    private val loadDamageTypes: LoadDamageTypes
) {
    @GetMapping
    fun getDamageTypes() = ResponseEntity.ok(loadDamageTypes.load())

    @GetMapping("/{index}")
    fun getDamageType(@PathVariable index: String) = ResponseEntity.ok(loadDamageType.load(index))
}