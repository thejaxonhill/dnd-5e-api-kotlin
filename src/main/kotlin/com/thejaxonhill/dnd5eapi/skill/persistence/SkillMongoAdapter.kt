package com.thejaxonhill.dnd5eapi.skill.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.skill.Skill
import com.thejaxonhill.dnd5eapi.skill.port.LoadSkillPort
import org.springframework.stereotype.Component

@Component
class SkillMongoAdapter(repository: SkillRepository) :
    MongoAdapter<Skill>(repository, Skill::class),
    LoadSkillPort