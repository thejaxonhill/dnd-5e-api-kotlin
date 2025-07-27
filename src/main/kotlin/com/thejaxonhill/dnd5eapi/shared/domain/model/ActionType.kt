package com.thejaxonhill.dnd5eapi.shared.domain.model

import com.fasterxml.jackson.annotation.JsonValue

enum class ActionType(@JsonValue val type: String) {
    Melee("melee"),
    Ranged("ranged"),
    Ability("ability"),
    Magic("magic");

    companion object {
        fun fromString(type: String) = when (type) {
            Melee.type -> Melee
            Ranged.type -> Ranged
            Ability.type -> Ability
            Magic.type -> Magic
            else -> null
        }
    }

}