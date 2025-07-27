package com.thejaxonhill.dnd5eapi.weaponproperty.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponProperty

interface LoadWeaponPropertyPort : BaseRepository<WeaponProperty, String>