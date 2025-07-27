package com.thejaxonhill.dnd5eapi.shared.domain.model

data class IdealOption(
    val desc: String,
    val alignments: List<ApiReference>
) : Option("ideal-option")
