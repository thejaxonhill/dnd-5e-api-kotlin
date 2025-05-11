package com.thejaxonhill.dnd5eapi.weaponproperty.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.weaponproperty.port.LoadWeaponPropertyPort
import org.springframework.stereotype.Service

@Service
class LoadWeaponProperty(private val loadWeaponPropertyPort: LoadWeaponPropertyPort) {
    fun load(index: String) = loadWeaponPropertyPort.loadByIndex(index) ?:
    throw NotFoundException()
}