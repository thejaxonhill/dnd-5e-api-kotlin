package com.thejaxonhill.dnd5eapi.shared.domain.model

data class Page(
    val page: Int? = 0,
    val size: Int? = 10,
    val sort: List<String>? = null,
)