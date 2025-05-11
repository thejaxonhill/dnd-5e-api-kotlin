package com.thejaxonhill.dnd5eapi.shared.model

data class IdealOption(
    val desc: String,
    val alignments: List<ApiReference>
) : Option("ideal-option")
