package com.thejaxonhill.dnd5eapi.magicschool.domain

import java.time.LocalDateTime

data class MagicSchool(
    val id: String? = null,
    val desc: String,
    val index: String,
    val name: String,
    val url: String,
    val updatedAt: LocalDateTime,
)

data class MagicSchoolExample(val name: String? )