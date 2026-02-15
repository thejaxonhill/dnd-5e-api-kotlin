package com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponProperty
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponPropertyExample
import com.thejaxonhill.dnd5eapi.weaponproperty.domain.repository.WeaponPropertyRepository
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoWeaponPropertyRepository(private val repository: WeaponPropertyMongoRepository) : WeaponPropertyRepository {
    override fun load(id: String): WeaponProperty? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): WeaponProperty? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: WeaponPropertyExample?): PagedModel<WeaponProperty> =
        repository.findAll(
            Example.of(example?.toWeaponPropertyDocument() ?: WeaponPropertyDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(weaponProperty: WeaponProperty) = repository.save(weaponProperty.toDocument()).toDomain()
}

fun WeaponPropertyDocument.toDomain() = WeaponProperty(
    id = id,
    desc = desc!!,
    index = index!!,
    name = name!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun WeaponProperty.toDocument() = WeaponPropertyDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    url = url,
    updatedAt = updatedAt,
)

fun WeaponPropertyExample.toWeaponPropertyDocument(): WeaponPropertyDocument = WeaponPropertyDocument(
    name = name
)
