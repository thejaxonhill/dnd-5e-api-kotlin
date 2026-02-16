package com.thejaxonhill.dnd5eapi.skill.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.skill.application.dto.toView
import com.thejaxonhill.dnd5eapi.skill.domain.SkillExample
import com.thejaxonhill.dnd5eapi.skill.domain.SkillRepository

@UseCase
class LoadSkills(private val skillRepository: SkillRepository) {
    fun load(page: Page, example: SkillExample?) =
        skillRepository.loadAll(page, example).map { it.toView() }
}