package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponProperty
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.repository.LoadWeaponPropertyPort
import org.springframework.stereotype.Component

@Component
class WeaponPropertyMongoAdapter(repository: WeaponPropertyMongoRepository) :
        MongoAdapter<WeaponProperty, WeaponPropertyDocument>(repository),
        LoadWeaponPropertyPort {
        override fun WeaponPropertyDocument.toDomain() = WeaponProperty(
                desc = desc,
                index = index,
                name = name,
                url = url,
                updatedAt = updatedAt,
        )
}