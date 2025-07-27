package com.thejaxonhill.dnd5eapi.shared.domain.model

data class ActionOption(
    val actionName: String,
    val count: Int,
    val type: com.thejaxonhill.dnd5eapi.shared.domain.model.ActionType,
    val notes: String? = null,
) : com.thejaxonhill.dnd5eapi.shared.domain.model.Option("action")
