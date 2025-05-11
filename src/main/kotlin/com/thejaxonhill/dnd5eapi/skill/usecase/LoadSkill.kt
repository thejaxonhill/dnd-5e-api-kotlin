package com.thejaxonhill.dnd5eapi.skill.usecase

import com.thejaxonhill.dnd5eapi.shared.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.skill.port.LoadSkillPort
import org.springframework.stereotype.Service

@Service
class LoadSkill(private val loadSkillPort: LoadSkillPort) {
    fun load(index: String) = loadSkillPort.loadByIndex(index) ?:
    throw NotFoundException()
}