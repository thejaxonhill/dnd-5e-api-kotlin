package com.thejaxonhill.dnd5eapi.monster.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ActionType

data class ActionOption(
    val actionName: String,
    val count: String,
    val type: ActionType,
)
