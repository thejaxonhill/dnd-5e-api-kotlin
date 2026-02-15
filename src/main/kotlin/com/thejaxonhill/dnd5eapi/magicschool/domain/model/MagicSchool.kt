package com.thejaxonhill.dnd5eapi.magicschool.domain.model

import java.util.*

data class MagicSchool(
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: Date,
)

data class MagicSchoolExample(val name: String? = null)