package com.thejaxonhill.dnd5eapi.skill.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.skill.domain.repository.SkillRepository

@UseCase
class LoadSkill(private val skillRepository: SkillRepository) {
    fun load(index: String) = skillRepository.loadByIndex(index) ?:
    throw NotFoundException()
}