package com.thejaxonhill.dnd5eapi.shared.model

data class OptionsArrayOptionSet(
    val options: List<Option>?
) : OptionSet("options_array")