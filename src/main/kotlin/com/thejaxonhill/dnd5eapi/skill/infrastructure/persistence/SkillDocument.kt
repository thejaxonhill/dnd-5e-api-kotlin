package com.thejaxonhill.dnd5eapi.skill.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "skills")
class SkillDocument(
    @Id
    var id: String? = null,
    var abilityScore: ApiReference? = null,
    var desc: List<String>? = null,
    var index: String? = null,
    var name: String? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)
