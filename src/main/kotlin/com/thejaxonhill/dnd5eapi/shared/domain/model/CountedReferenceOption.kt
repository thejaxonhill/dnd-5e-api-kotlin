package com.thejaxonhill.dnd5eapi.shared.domain.model

data class CountedReferenceOption(
    val count: Int,
    val of: com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference,
    val prerequisites: List<com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite>? = null
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Option("counted_reference")
