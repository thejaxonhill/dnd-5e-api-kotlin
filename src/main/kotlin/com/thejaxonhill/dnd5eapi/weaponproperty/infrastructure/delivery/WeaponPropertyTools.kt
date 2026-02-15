package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponProperties
import com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase.LoadWeaponPropertyByIndex
import org.springframework.ai.tool.annotation.Tool

@McpTools
class WeaponPropertyTools(
    private val loadWeaponPropertyByIndex: LoadWeaponPropertyByIndex,
    private val loadWeaponProperties: LoadWeaponProperties
) {
    @Tool
    fun getWeaponProperties(pageNumber: Int? = 1, pageSize: Int? = 20) =
        loadWeaponProperties.load(Page(pageNumber ?: 1, pageSize ?: 20), null)

    @Tool
    fun getWeaponProperty(index: String) = loadWeaponPropertyByIndex.load(index)
}