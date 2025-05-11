package com.thejaxonhill.dnd5eapi.shared.model

data class CountedReferenceOption(
    val count: Int,
    val of: ApiReference,
    val prerequisites: List<Prerequisite>? = null
) : Option("counted_reference")
