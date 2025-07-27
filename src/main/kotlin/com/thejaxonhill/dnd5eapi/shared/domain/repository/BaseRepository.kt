package com.thejaxonhill.dnd5eapi.shared.domain.repository

interface BaseRepository<ENTITY, ID> {
    fun loadByIndex(index: ID): ENTITY?
    fun loadAll(): List<ENTITY>
}