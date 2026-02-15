package com.thejaxonhill.dnd5eapi.language.application.dto

import com.thejaxonhill.dnd5eapi.language.domain.model.Language

data class LanguageView(
    val desc: String? = null,
    val index: String,
    val name: String,
    val script: String? = null,
    val type: String,
    val typicalSpeakers: List<String>,
    val url: String,
)

fun Language.toView() = LanguageView(
    desc = desc,
    index = index,
    name = name,
    script = script,
    type = type,
    typicalSpeakers = typicalSpeakers,
    url = url,
)
