package com.thejaxonhill.dnd5eapi.weaponproperty.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.weaponproperty.WeaponProperty
import com.thejaxonhill.dnd5eapi.weaponproperty.port.LoadWeaponPropertyPort
import org.springframework.stereotype.Component

@Component
class WeaponPropertyMongoAdapter(repository: WeaponPropertyRepository) :
        MongoAdapter<WeaponProperty>(repository, WeaponProperty::class),
        LoadWeaponPropertyPort