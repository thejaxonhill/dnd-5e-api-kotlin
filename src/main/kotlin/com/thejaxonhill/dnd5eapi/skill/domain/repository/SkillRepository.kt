package com.thejaxonhill.dnd5eapi.skill.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository
import com.thejaxonhill.dnd5eapi.skill.domain.model.Skill

interface SkillRepository : BaseRepository<Skill, String>