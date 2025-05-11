package com.thejaxonhill.dnd5eapi.equipment.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.IndexedMongoRepository

interface EquipmentRepository : IndexedMongoRepository<EquipmentDocument, String>