package com.thejaxonhill.dnd5eapi.skill.usecase

import com.thejaxonhill.dnd5eapi.skill.port.LoadSkillPort
import org.springframework.stereotype.Service

@Service
class LoadSkills(private val loadSkillPort: LoadSkillPort) {
    fun load() = loadSkillPort.loadAll()
}