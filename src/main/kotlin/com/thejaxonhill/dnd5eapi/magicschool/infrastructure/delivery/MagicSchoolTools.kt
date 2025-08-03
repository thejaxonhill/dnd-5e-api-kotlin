package com.thejaxonhill.dnd5eapi.magicschool.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.magicschool.application.usecase.LoadMagicSchool
import com.thejaxonhill.dnd5eapi.magicschool.application.usecase.LoadMagicSchools
import com.thejaxonhill.dnd5eapi.shared.infrastructure.stereotype.McpTools
import org.springframework.ai.tool.annotation.Tool

@McpTools
class MagicSchoolTools(
    private val loadMagicSchool: LoadMagicSchool,
    private val loadMagicSchools: LoadMagicSchools
) {
    @Tool
    fun getMagicSchools() = loadMagicSchools.load()

    @Tool
    fun getMagicSchool(index: String) = loadMagicSchool.load(index)
}