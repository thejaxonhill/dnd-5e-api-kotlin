package com.thejaxonhill.dnd5eapi.skill.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.skill.domain.repository.SkillRepository

@UseCase
class LoadSkills(private val skillRepository: SkillRepository) {
    fun load() = skillRepository.loadAll()
}