package com.thejaxonhill.dnd5eapi.shared.model

data class ActionOption(
    val actionName: String,
    val count: Int,
    val type: ActionType,
    val notes: String? = null,
) : Option("action")
