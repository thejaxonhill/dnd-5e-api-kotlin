package com.thejaxonhill.dnd5eapi.condition.persistence

import com.thejaxonhill.dnd5eapi.condition.Condition
import com.thejaxonhill.dnd5eapi.condition.port.LoadConditionPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class ConditionMongoAdapter(repository: ConditionRepository) :
    MongoAdapter<Condition>(repository, Condition::class),
    LoadConditionPort