package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface IndexedMongoRepository<T, ID> : MongoRepository<T, ID> {
    fun findByIndex(index: String): T?
}