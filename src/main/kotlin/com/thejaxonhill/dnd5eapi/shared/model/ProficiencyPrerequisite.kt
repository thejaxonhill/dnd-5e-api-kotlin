package com.thejaxonhill.dnd5eapi.shared.model

data class ProficiencyPrerequisite(
    val proficiency: ApiReference? = null,
) : Prerequisite("proficiency")
