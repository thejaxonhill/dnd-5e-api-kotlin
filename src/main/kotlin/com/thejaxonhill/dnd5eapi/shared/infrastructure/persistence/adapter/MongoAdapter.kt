package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort

abstract class MongoAdapter<DOMAIN, ENTITY : Any>(private val repository: IndexedMongoRepository<ENTITY, String>) {
    protected abstract fun ENTITY.toDomain(): DOMAIN
    protected abstract fun DOMAIN.toEntity(): ENTITY

    fun loadByIndex(index: String) = repository.findByIndex(index)?.toDomain()

    fun loadAll() = repository.findAll(Sort.by(Sort.Order.asc("index"))).map { it.toDomain() }

    fun loadAll(example: DOMAIN, pageable: Pageable) =
        repository.findAll(Example.of(example.toEntity()), pageable).map { it.toDomain() }
}