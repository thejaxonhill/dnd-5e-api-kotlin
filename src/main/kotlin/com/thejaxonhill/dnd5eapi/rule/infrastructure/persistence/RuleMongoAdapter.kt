package com.thejaxonhill.dnd5eapi.rule.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.rule.domain.model.Rule
import com.thejaxonhill.dnd5eapi.rule.domain.repository.LoadRulePort
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RuleMongoAdapter(repository: RuleMongoRepository) :
    MongoAdapter<Rule, RuleDocument>(repository),
    LoadRulePort {
    override fun RuleDocument.toDomain() = Rule(
        desc = desc,
        index = index,
        name = name,
        subsections = subsections,
        url = url,
        updatedAt = updatedAt,
    )
}