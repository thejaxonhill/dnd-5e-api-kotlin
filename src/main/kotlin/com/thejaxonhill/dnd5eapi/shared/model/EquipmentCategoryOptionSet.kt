package com.thejaxonhill.dnd5eapi.shared.model

data class EquipmentCategoryOptionSet(
    val equipmentCategory: ApiReference
) : OptionSet("equipment_category")
