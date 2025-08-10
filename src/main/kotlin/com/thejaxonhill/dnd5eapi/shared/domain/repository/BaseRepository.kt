package com.thejaxonhill.dnd5eapi.shared.domain.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface BaseRepository<ENTITY, ID> {
    fun loadByIndex(index: ID): ENTITY?
    fun loadAll(): List<ENTITY>
    fun loadAll(example: ENTITY, pageable: Pageable): Page<ENTITY>
}