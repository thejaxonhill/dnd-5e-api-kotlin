package com.thejaxonhill.dnd5eapi.equipment.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.repository.IndexedMongoRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface EquipmentMongoRepository : IndexedMongoRepository<EquipmentDocument, String> {
    fun findByNameContainsIgnoreCase(name: String, pageable: Pageable): Page<EquipmentDocument>
}