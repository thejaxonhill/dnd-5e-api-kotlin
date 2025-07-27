package com.thejaxonhill.dnd5eapi.shared.domain.model

data class DifficultyClass(
    val dcType: ApiReference,
    val dcValue: Int? = null,
    val successType: com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType
)
