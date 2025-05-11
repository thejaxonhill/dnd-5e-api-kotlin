package com.thejaxonhill.dnd5eapi.rule.persistence

import com.thejaxonhill.dnd5eapi.rule.Rule
import com.thejaxonhill.dnd5eapi.rule.port.LoadRulePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RuleMongoAdapter(repository: RuleRepository) :
    MongoAdapter<Rule>(repository, Rule::class),
    LoadRulePort