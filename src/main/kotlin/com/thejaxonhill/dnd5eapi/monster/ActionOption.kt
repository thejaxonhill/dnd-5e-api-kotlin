package com.thejaxonhill.dnd5eapi.monster

import com.thejaxonhill.dnd5eapi.shared.model.ActionType

data class ActionOption(
    val actionName: String,
    val count: String,
    val type: ActionType,
)
