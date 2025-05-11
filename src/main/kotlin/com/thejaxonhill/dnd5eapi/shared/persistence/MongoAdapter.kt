package com.thejaxonhill.dnd5eapi.shared.persistence

import com.thejaxonhill.dnd5eapi.shared.converter.mapTo
import kotlin.reflect.KClass

open class MongoAdapter<T : Any>(
    private val repository: IndexedMongoRepository<out Any, String>,
    private val destinationClass: KClass<T>
) {
    fun loadByIndex(index: String) = repository.findByIndex(index)?.mapTo(destinationClass)
    fun loadAll() = repository.findAll().map { it.mapTo(destinationClass) }
}