package com.thejaxonhill.dnd5eapi.shared.model

data class MultipleOption(
    val items: List<Option>
) : Option("multiple")