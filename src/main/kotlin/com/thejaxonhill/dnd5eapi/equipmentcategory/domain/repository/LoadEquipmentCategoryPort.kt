package com.thejaxonhill.dnd5eapi.equipmentcategory.domain.repository

import com.thejaxonhill.dnd5eapi.equipmentcategory.domain.model.EquipmentCategory
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface LoadEquipmentCategoryPort : BaseRepository<EquipmentCategory, String>