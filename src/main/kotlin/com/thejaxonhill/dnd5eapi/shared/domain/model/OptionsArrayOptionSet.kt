package com.thejaxonhill.dnd5eapi.shared.domain.model

data class OptionsArrayOptionSet(
    val options: List<Option>?
) : OptionSet("options_array")