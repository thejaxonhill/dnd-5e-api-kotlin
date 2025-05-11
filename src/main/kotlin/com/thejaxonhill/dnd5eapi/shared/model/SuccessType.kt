package com.thejaxonhill.dnd5eapi.shared.model

import com.fasterxml.jackson.annotation.JsonValue

enum class SuccessType(@JsonValue val type: String) {
    None("none"),
    Half("half"),
    Other("other");

    companion object {
        fun fromString(type: String) = when (type) {
            None.type -> None
            Half.type -> Half
            else -> Other
        }
    }
}