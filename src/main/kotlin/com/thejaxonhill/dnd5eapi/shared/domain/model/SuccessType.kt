package com.thejaxonhill.dnd5eapi.shared.domain.model

import com.fasterxml.jackson.annotation.JsonValue

enum class SuccessType(@JsonValue val type: String) {
    None("none"),
    Half("half"),
    Other("other");

    companion object {
        fun fromString(type: String) = when (type) {
            com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.None.type -> com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.None
            com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.Half.type -> com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.Half
            else -> com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.Other
        }
    }
}