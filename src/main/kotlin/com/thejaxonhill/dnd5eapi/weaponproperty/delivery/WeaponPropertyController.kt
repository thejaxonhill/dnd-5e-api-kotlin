package com.thejaxonhill.dnd5eapi.weaponproperty.delivery

import com.thejaxonhill.dnd5eapi.weaponproperty.usecase.LoadWeaponProperties
import com.thejaxonhill.dnd5eapi.weaponproperty.usecase.LoadWeaponProperty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/weapon-properties")
class WeaponPropertyController(
    private val loadWeaponProperty: LoadWeaponProperty,
    private val loadWeaponProperties: LoadWeaponProperties
) {
    @GetMapping
    fun getWeaponProperties() = ResponseEntity.ok(loadWeaponProperties.load())

    @GetMapping("/{index}")
    fun getWeaponProperty(@PathVariable index: String) = ResponseEntity.ok(loadWeaponProperty.load(index))
}