package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponProperties
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponProperty
import org.springframework.ai.tool.annotation.Tool

@McpTools
class WeaponPropertyTools(
    private val loadWeaponProperty: LoadWeaponProperty,
    private val loadWeaponProperties: LoadWeaponProperties
) {
    @Tool
    fun getWeaponProperties() = loadWeaponProperties.load()

    @Tool
    fun getWeaponProperty(index: String) = loadWeaponProperty.load(index)
}