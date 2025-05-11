package com.thejaxonhill.dnd5eapi.abilityscore.persistence

import com.thejaxonhill.dnd5eapi.abilityscore.AbilityScore
import com.thejaxonhill.dnd5eapi.abilityscore.port.LoadAbilityScorePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class AbilityScoreMongoAdapter(repository: AbilityScoreRepository) :
    MongoAdapter<AbilityScore>(repository, AbilityScore::class),
    LoadAbilityScorePort