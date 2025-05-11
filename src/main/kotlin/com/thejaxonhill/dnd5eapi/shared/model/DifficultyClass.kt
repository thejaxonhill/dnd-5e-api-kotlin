package com.thejaxonhill.dnd5eapi.shared.model

data class DifficultyClass(
    val dcType: ApiReference,
    val dcValue: Int? = null,
    val successType: SuccessType
)
