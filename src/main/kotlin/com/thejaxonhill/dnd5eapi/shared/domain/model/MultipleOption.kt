package com.thejaxonhill.dnd5eapi.shared.domain.model

data class MultipleOption(
    val items: List<Option>
) : Option("multiple")