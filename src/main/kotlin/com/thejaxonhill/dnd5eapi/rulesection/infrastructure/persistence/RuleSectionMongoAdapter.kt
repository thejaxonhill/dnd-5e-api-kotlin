package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.rulesection.domain.model.RuleSection
import com.thejaxonhill.dnd5eapi.rulesection.domain.repository.RuleSectionRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RuleSectionMongoAdapter(repository: RuleSectionMongoRepository) :
    MongoAdapter<RuleSection, RuleSectionDocument>(repository),
    RuleSectionRepository {
    override fun RuleSectionDocument.toDomain() = RuleSection(
        desc = desc,
        index = index,
        name = name,
        url = url,
        updatedAt = updatedAt,
    )
}