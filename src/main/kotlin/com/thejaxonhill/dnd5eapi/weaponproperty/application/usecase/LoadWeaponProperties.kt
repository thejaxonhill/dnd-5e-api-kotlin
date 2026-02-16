package com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.weaponproperty.application.dto.toView
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.WeaponPropertyExample
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.WeaponPropertyRepository

@UseCase
class LoadWeaponProperties(private val weaponPropertyRepository: WeaponPropertyRepository) {
    fun load(page: Page, example: WeaponPropertyExample?) =
        weaponPropertyRepository.loadAll(page, example).map { it.toView() }
}