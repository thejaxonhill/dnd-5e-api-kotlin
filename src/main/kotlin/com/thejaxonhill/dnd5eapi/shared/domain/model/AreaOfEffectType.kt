package com.thejaxonhill.dnd5eapi.shared.domain.model

import com.fasterxml.jackson.annotation.JsonValue

enum class AreaOfEffectType(@JsonValue val type: String) {
    Sphere("sphere"),
    Cube("cube"),
    Cylinder("cylinder"),
    Line("line"),
    Cone("cone"),
    Unknown("unknown");

    companion object {
        fun fromString(type: String) = entries.firstOrNull { it.type == type } ?: com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffectType.Unknown
    }
}