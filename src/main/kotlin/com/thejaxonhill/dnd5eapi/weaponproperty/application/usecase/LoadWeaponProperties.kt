package com.thejaxonhill.dnd5eapi.weaponproperty.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.repository.LoadWeaponPropertyPort

@UseCase
class LoadWeaponProperties(private val loadWeaponPropertyPort: LoadWeaponPropertyPort) {
    fun load() = loadWeaponPropertyPort.loadAll()
}