package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository
import org.springframework.data.domain.Sort

abstract class MongoAdapter<DOMAIN, ENTITY>(private val repository: IndexedMongoRepository<out ENTITY, String>) {
    protected abstract fun ENTITY.toDomain(): DOMAIN
    fun loadByIndex(index: String) = repository.findByIndex(index)?.toDomain()
    fun loadAll() = repository.findAll(Sort.by(Sort.Order.asc("index"))).map { it.toDomain() }
}