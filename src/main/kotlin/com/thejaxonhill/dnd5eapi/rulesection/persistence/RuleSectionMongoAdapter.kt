package com.thejaxonhill.dnd5eapi.rulesection.persistence

import com.thejaxonhill.dnd5eapi.rulesection.RuleSection
import com.thejaxonhill.dnd5eapi.rulesection.port.LoadRuleSectionPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RuleSectionMongoAdapter(repository: RuleSectionRepository) :
    MongoAdapter<RuleSection>(repository, RuleSection::class),
    LoadRuleSectionPort