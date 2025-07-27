package com.thejaxonhill.dnd5eapi.shared.domain.model

data class ProficiencyPrerequisite(
    val proficiency: ApiReference? = null,
) : Prerequisite("proficiency")
