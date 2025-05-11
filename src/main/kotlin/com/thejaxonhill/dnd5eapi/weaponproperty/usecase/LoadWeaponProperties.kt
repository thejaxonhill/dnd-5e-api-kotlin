package com.thejaxonhill.dnd5eapi.weaponproperty.usecase

import com.thejaxonhill.dnd5eapi.weaponproperty.port.LoadWeaponPropertyPort
import org.springframework.stereotype.Service

@Service
class LoadWeaponProperties(private val loadWeaponPropertyPort: LoadWeaponPropertyPort) {
    fun load() = loadWeaponPropertyPort.loadAll()
}